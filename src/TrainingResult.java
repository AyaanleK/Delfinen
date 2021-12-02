public class TrainingResult {

   double time;
   String date;
   String disciplin;


  public TrainingResult(double mTime, String mDate, String mDisciplin){

    this.time = mTime;
    this.date = mDate;
    this.disciplin = mDisciplin;
  }

  public String getDate(){
    return " Date";
  }

  public double getTime(){
    return time;
  }


  public String trouvResult(){
    String trainResult = getDate() + " " + getTime();

    return trainResult;
  }


}
