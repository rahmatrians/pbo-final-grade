import java.util.Scanner;
import java.util.ArrayList;

//Created by Rahmat Riansyah - 41519010010

class Main {

    public static void main(String[] args) {
        Scanner inputFunc = new Scanner(System.in);
        Grades finalGrade = new Grades();
        ArrayList<Object> getData = new ArrayList();
        int maajorAssignment1, maajorAssignment2, finalExam;

        System.out.printf("%115s\n%100s\n%100s\n%105s\n", "DAFTAR NILAI SEMESTER GENAP TAHUN AKADEMIK 2020/2021",
                "UNIVERSITAS MERCUBUANA", "FAKULTAS ILMU KOMPUTER", "PROGRAM STUDI : TEKNIK INFORMATIKA");

        System.out.print("1. MASUKAN NILAI TUGAS BESAR 1   : ");
        maajorAssignment1 = inputFunc.nextInt();

        System.out.print("2. MASUKAN NILAI TUGAS BESAR 2   : ");
        maajorAssignment2 = inputFunc.nextInt();

        System.out.print("3. MASUKAN NILAI UAS             : ");
        finalExam = inputFunc.nextInt();

        getData = finalGrade.calculate(maajorAssignment1, maajorAssignment2, finalExam);

        System.out.println("4. NILAI AKHIR               : " + getData.get(0) + " / " + getData.get(1));

    }
}

class Grades {

    public ArrayList<Object> calculate(int ma1, int ma2, int fe) {
        ArrayList<Object> getAll = new ArrayList();

        int getGrade = majorAssignment1(ma1) + majorAssignment2(ma2) + finalExam(fe);
        String converting = convertToIndex(getGrade);
        getAll.add(Integer.toString(getGrade));
        getAll.add(converting);
        return getAll;
    }

    public Integer majorAssignment1(int mj1) {
        mj1 = mj1 * 30 / 100;
        return mj1;
    }

    public Integer majorAssignment2(int mj2) {
        mj2 = mj2 * 30 / 100;
        return mj2;
    }

    public Integer finalExam(int fe) {
        fe = fe * 40 / 100;
        return fe;
    }

    public String convertToIndex(int value) {
        String index;
        if (value >= 85) {
            index = "A";
        } else if (value >= 80) {
            index = "A-";
        } else if (value >= 75) {
            index = "B+";
        } else if (value >= 70) {
            index = "B";
        } else if (value >= 65) {
            index = "B-";
        } else if (value >= 60) {
            index = "C+";
        } else if (value >= 55) {
            index = "C";
        } else if (value >= 50) {
            index = "C-";
        } else if (value >= 40) {
            index = "D";
        } else {
            index = "E";
        }
        return index;
    }

}