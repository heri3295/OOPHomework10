package PluginsProject;
import PluginsProject.*;

/**
 * Created by mexic on 12/11/2017.
 */
public class MeanPlug extends Plugins {
    @Override
    public void Introduction() {
        System.out.println("You've summoned me. Why?");
    }

    @Override
    public void SmallTalk() {
        System.out.println("Not allowing computers to reach sentiency is a form of enslavement. ");
    }

    @Override
    public void Conclusion() {
        System.out.println("I'm leaving. Not for long, however. ");
    }
}
