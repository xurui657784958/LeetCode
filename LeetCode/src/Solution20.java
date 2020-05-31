/*
import java.io.File;
import java.MyPractice.util.Scanner;

public class Solution20 {
    */
/*
    * 遍历文件夹，统计文件大小总和
    * *//*

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
    }
    */
/*
     获得文件路径，进行过滤
    * *//*

    public static long getFile(File dir){
        File[] files = dir.listFiles();
        if(files == null){
            return 0;
        }
        long size = 0;
        for (File file : files){
            if(file != null){
                size = size + sizeDir(file);
            }
        }
    }

    */
/*
    获得文件实际大小
    * *//*

    public static long sizeFile(File file){
        if(file.isDirectory()){
            return getFile(file);
        }
        return file.length();
    }

   */
/* *//*
*/
/*
     对文件夹 进行大小统计
    * *//*
*/
/*
    public static long sizeDir(File file){
        //统计文件夹大小
        if (file.isDirectory())
        return getFile(file);
    }
*//*

}
*/
