import java.io.File;//import the file class
import java.io.IOException;//import IOExcemption class to handle errors

public class createfile {
    public static void main(String[] args){
        try{
            File myObj=new File("file.txt");
            if(myObj.createNewFile()){
                System.out.println("file created:" +myObj.getName());

            }else {
                System.out.println("file already exists");
            }
        }catch (IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}

