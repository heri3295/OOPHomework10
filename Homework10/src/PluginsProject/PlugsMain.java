package PluginsProject;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by mexic on 12/11/2017.
 */
public class PlugsMain {
    public static void main (String[] args) throws Throwable{
        PlugsMain main = new PlugsMain();
        File[] plugins = main.getFileNames("C:\\Users\\mexic\\Documents\\Schoolwork\\CISC3150\\Homework10\\src\\PluginsProject\\Plugs");
        main.displayFileNames(plugins);
        int pluginNum = main.getWhichPluginNum(plugins);
        String chosenPlug = plugins[pluginNum].getName();

        chosenPlug = chosenPlug.replace(".java", "");
        Class<?> mclass = Class.forName(chosenPlug);
        Object instance = mclass.newInstance();
        Method[] methods = mclass.getMethods();

        for (int i = 0; i < methods.length; i++ ) {
            methods[i].invoke(instance);
            //System.out.println(methods[i].toString());
        }
    }

    public File[] getFileNames(String dir){
        File pluginFolder = new File(dir);
        return pluginFolder.listFiles();
    }

    public void displayFileNames(File[] Plugins){
        System.out.println("My plugins: ");
        for (int i = 0; i < Plugins.length; i++) {
            System.out.printf("%d: \t %s\n", i, Plugins[i].getName());
        }
    }

    public int getWhichPluginNum(File[] Plugins){
        while (true) {
            Scanner read = new Scanner(System.in);
            System.out.println("Which plugin to choose?");
            if (read.hasNextInt()) {
                int num = read.nextInt();
                if (num >= 0 && num <= (Plugins.length - 1)) {
                    return num;
                } else {
                    System.out.println("Out of bounds!");
                }
            } else {
                System.out.println("A number please!");
            }
        }
    }
}