import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Objects;

public class PatientJournal {
    final String name = "Beth";
    final int age = 68;
    static String report;
    static String date;
    static String time;
    static boolean worried;
    static ArrayList<PatientJournal> patientJournal = new ArrayList();

    public PatientJournal(String date1, String time1, boolean worried1, String report1) {
        date = date1;
        time = time1;
        worried = worried1;
        report = report1;
    }

    public static void updateReport(String date1, String time1, boolean worried1, String report1) {
        PatientJournal report = new PatientJournal(date1, time1, worried1, report1);
        patientJournal.add(report);
    }

    public static void getReport(int n) {
        int length = patientJournal.size();

        for(int i = length - 1; i >= length - n; --i) {
            System.out.println();
            PrintStream var10000 = System.out;
            Objects.requireNonNull((PatientJournal)patientJournal.get(i));
            Objects.requireNonNull((PatientJournal)patientJournal.get(i));
            PatientJournal var10003 = (PatientJournal)patientJournal.get(i);
            String var6 = date;
            PatientJournal var10004 = (PatientJournal)patientJournal.get(i);
            String var7 = date;
            PatientJournal var10005 = (PatientJournal)patientJournal.get(i);
            var10000.println("Report for " + "Beth" + " aged " + 68 + " on " + var6 + " at " + var7 + " is " + time);
            var10000 = System.out;
            PatientJournal var10001 = (PatientJournal)patientJournal.get(i);
            var10000.println("    Worried: " + worried);
            var10000 = System.out;
            var10001 = (PatientJournal)patientJournal.get(i);
            var10000.println("    Report: " + report);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        boolean log = true;
        if (log) {
            updateReport("March 3rd", "17:24", false, "Was very active today");
            updateReport("March 4th", "18:00", true, "Took a fall at 12pm. Medical team says to monitor closely");
        }

        getReport(2);
    }
}