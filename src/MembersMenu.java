import java.util.ArrayList;


public class MembersMenu {
  private ArrayList<Members> myMembers;
  private ArrayList<String> myMembersDiciplin;



  public MembersMenu() {

    this.myMembers = new ArrayList<Members>();
    this.myMembersDiciplin = new ArrayList<String>();

  }

  public boolean addNewMember(Members members) {
    if(findContact(members.getFirstName()) >=0) {
      System.out.println("Member is already on file");
      return false;
    }
    myMembers.add(members);

    return true;
  }




  private int findContact(String contactName) {
    for(int i = 0; i<this.myMembers.size(); i++) {
      Members members = this.myMembers.get(i);
      if(members.getFirstName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }










  //____________________________ Fait ____________________//

  public void printContacts() {
    System.out.println("Members List");
    System.out.println("------------");
    for(int i = 0; i<this.myMembers.size(); i++) {
      System.out.println((i+1) + ". Personne"+ "\n" +
          "First name: " + this.myMembers.get(i).getFirstName()   + "\n" +
          "Last name: " + this.myMembers.get(i).getLastName()    + " \n" +
          "Age: " + this.myMembers.get(i).getAge()         + "\n" +
          "Konkurrent: " + this.myMembers.get(i).getHold()         + "\n" +
          "Hold: " + this.myMembers.get(i).setHold()  + "\n" +
          "Activ: " + this.myMembers.get(i).getActivPassiv() + "\n ");


    }
  }



  public void printTotalMoney(){
    System.out.println("Members total income");
    System.out.println("------------");
    for (int i = 0; i <this.myMembers.size(); i++){
      System.out.println("The total: " + this.myMembers.get(i).getPrix());
    }
  }



}
