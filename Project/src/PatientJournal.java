import java.util.ArrayList;

public class PatientJournal {
    final String name = "Beth";
    final int age = 68;
    String report;
    String date;
    String time;
    boolean worried;


    public PatientJournal(String date1, String time1, boolean worried1, String report1) {
        date = date1;
        time = time1;
        worried = worried1;
        report = report1;
    }

    public static void updateReport(ArrayList<PatientJournal> journal, String date1, String time1, boolean worried1, String report1) {
        PatientJournal report = new PatientJournal(date1, time1, worried1, report1);
        journal.add(report);
    }

    public static void getReport(int n, ArrayList<PatientJournal> journal) {
        int length = journal.size();

        for(int i = length - 1; i >= length - n; i--) {
            System.out.println();
            String repName  = journal.get(i).name;
            int repAge = journal.get(i).age;
            String repDate = journal.get(i).date;
            String repTime = journal.get(i).time;
            boolean repWorried = journal.get(i).worried;
            String repReport = journal.get(i).report;

            System.out.println("Report for " + repName + " aged " + repAge + " on " + repDate + " at " + repTime);
            System.out.println("    Worried: " + repWorried);
            System.out.println("    Report: " + repReport);
        }

    }

    public static void main(String[] args) {
        ArrayList<PatientJournal> beths_journal = new ArrayList();
        boolean log = true;
        if (log) {
            updateReport(beths_journal, "March 3rd", "17:24", false, "Was very active today");
            updateReport(beths_journal, "March 4th", "18:00", true, "Took a fall at 12pm. Medical team says to monitor closely");
            updateReport(beths_journal, "March 5th", "09:00", true, "Woke up with a headache and nausea. Medical team says to monitor closely");


            /*
                New Code Below
            */
            //updateReport(beths_journal, "March 6th", "12:30", true, "Beth burst out the window saying she needed to come to a club called eleet coders?. We have dispatched law enforcement to find her.");


        }

        getReport(3, beths_journal);

        
    }
}