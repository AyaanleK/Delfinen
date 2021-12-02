import java.util.ArrayList;

public class Members {
  private String firstName;
  private String lastName;
  private Boolean activOrPassiv;
  private int age;
  private boolean hold;
  private boolean konkurrent;

  private double prix;

  public Members(String fName, String lName, Boolean ActivPassiv,
                 int mAge, boolean mHold, boolean mKonkurrent) {
    this.firstName = fName;
    this.lastName = lName;
    this.activOrPassiv = ActivPassiv;
    this.age = mAge;
    this.hold = mHold;
    this.konkurrent = mKonkurrent;


  }




  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public Boolean getActivPassiv() {
    if (activOrPassiv == true) {
      return true;
    }
    return false;
  }

  public double getPrix() {
    return prix;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public boolean getHold() {
    return this.hold;
  }



  public static Members createMember(String firstName, String lastName, Boolean isActivPassiv,
                                     int membersAge, boolean hold, boolean konkurrent) {
    return new Members (firstName, lastName, isActivPassiv, membersAge, hold, konkurrent);
  }


  public String setActivOrPassiv() {
    if (activOrPassiv == true) {
      return " is Activ";
    } else if (activOrPassiv == false) {
      return " is passiv";
    }
    return ("input incorrect !!!");
  }

  public String setAge() {
    if (age < 18) {
      return (" is junior.");
    } else if (age > 18) {
      return (" is senior. ");
    }
    return ("Input incorrect !!!");
  }

  public int setPrix() {
    if ((activOrPassiv.equals(true)) && (age < 18)) {
      return 1000;
    } else if ((activOrPassiv.equals(true)) && ((age > 18) && (age < 59))) {
      return 1600;
    } else if (activOrPassiv.equals(true) && (age > 60)) {
      return 1200;
    } else {
      return 500;
    }
  }

  public String setHold() {
    if ((activOrPassiv.equals(true)) && (age) < 18) {
      return " is in ungdomsholdet ";
    } else if (activOrPassiv.equals(true) && (age) > 18) {
      return " is in seniorholdet ";
    } else if (activOrPassiv.equals(false)) {
      return " is a motionist ";
    } else
      return "Input incorrect";
  }

  public String setDisciplin(){

    if ((activOrPassiv.equals(true))&& (konkurrent == true)){

    }
    return " ";
  }

}
