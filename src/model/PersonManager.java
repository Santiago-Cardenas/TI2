package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Random;

public class PersonManager {

    private String FILE_NAME_DATA_CSV_PATH = "data/babynames.csv";
    private String FILE_SURNAME_DATA_CSV_PATH = "data/NamesCensus.csv";
    private int age=0;


    public PersonManager() {
    }



    private void generatePerson() throws IOException {
        String name=selectRandomName();
        String surname=selectRandomSurName();
        String bd=selectRandomBD();
        String gender=selectRandomGender();
        int height=selectRandomHeight();

    }

    public String selectRandomName() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME_DATA_CSV_PATH));
        int valueName= randomBetween(1,6782);
        boolean end=false;
        String line = br.readLine();
        String randName="";
        int count=0;
        while (line != null && count!=valueName && end==false) {
            count++;
            if(count==valueName){
                end=true;
                randName=line;
            }
            line = br.readLine();
        }
        br.close();
        return randName;
    }

    public String selectRandomSurName() throws IOException {
        BufferedReader bR = new BufferedReader(new FileReader(FILE_SURNAME_DATA_CSV_PATH));
        int valueName= randomBetween(1,162253);
        boolean end=false;
        String line = bR.readLine();
        String randName="";
        int count=0;
        while (line != null && count!=valueName && end==false) {
            count++;
            if(count==valueName){
                end=true;
                randName=line;
            }
            line = bR.readLine();
        }
        bR.close();
        return randName;
    }

    public String selectRandomBD() {

        GregorianCalendar birthDate = new GregorianCalendar();

        Random agePercentage = new Random();
        int agePerc = agePercentage.nextInt(100);
        int year = 0;

        if (agePerc < 19){ // 1-14 años
            year = randomBetween(2008, 2021);
            age=2022-year;
        }
        else if (agePerc < 32){ // 15-24 años
            year = randomBetween(1988, 2007);
            age=2022-year;
        }
        else if (agePerc < 71){ // 25-54 años
            year = randomBetween(1968, 1987);
            age=2022-year;
        }
        else if (agePerc < 84){ // 55-64 años
            year = randomBetween(1958, 1967);
            age=2022-year;
        }
        else { // 65 años y más
            year = randomBetween(1922, 1957);
            age=2022-year;
        }

        birthDate.set(birthDate.YEAR, year);

        int dayOfYear = randomBetween(1, birthDate.getActualMaximum(birthDate.DAY_OF_YEAR));

        birthDate.set(birthDate.DAY_OF_YEAR, dayOfYear);

        String bd = (birthDate.get(birthDate.YEAR) + "-" + (birthDate.get(birthDate.MONTH) + 1) + "-" + birthDate.get(birthDate.DAY_OF_MONTH));

        return bd;
    }

    public String selectRandomGender(){
        int random= randomBetween(1,2);
        if(random==1){
            return "Male";
        }
        return "Female";
    }

    public int selectRandomHeight(){
        int height=0;

        if(age<2){
            height = 87 - randomBetween(0,8);
        }
        else if(age<5){
            if(randomBetween(1,2)==1) {
                height = 109 + randomBetween(0,10);
            }
            else{
                height = 109 - randomBetween(0,15);
            }
        }
        else if(age<7){
            if(randomBetween(1,2)==1) {
                height = 122 + randomBetween(0,12);
            }
            else{
                height = 122 - randomBetween(0,10);
            }
        }
        else if(age<9){
            if(randomBetween(1,2)==1) {
                height = 133 + randomBetween(0,10);
            }
            else{
                height = 133 - randomBetween(0,12);
            }
        }
        else if(age<11){
            if(randomBetween(1,2)==1) {
                height = 143 + randomBetween(0,13);
            }
            else{
                height = 143 - randomBetween(0,10);
            }
        }
        else if(age<13){
            if(randomBetween(1,2)==1) {
                height = 156 + randomBetween(0,14);
            }
            else{
                height = 156 - randomBetween(0,13);
            }
        }
        else if(age<15){
            if(randomBetween(1,2)==1) {
                height = 170 + randomBetween(0,5);
            }
            else{
                height = 170 - randomBetween(0,14);
            }
        }
        else if(age<17){
            if(randomBetween(1,2)==1) {
                height = 175 + randomBetween(0,1);
            }
            else{
                height = 175 - randomBetween(0,5);
            }
        }
        else if(age<19){
            if(randomBetween(1,2)==1) {
                height = 176 + randomBetween(0,1);
            }
            else{
                height = 176 - randomBetween(0,1);
            }
        }
        else{
            if(randomBetween(1,2)==1) {
                height = 177 + randomBetween(0,3);
            }
            else{
                height = 177 - randomBetween(0,1);
            }
        }
        return height;
    }

    public static int randomBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
