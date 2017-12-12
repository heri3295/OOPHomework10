package PluginsProject.Plugs;
import PluginsProject.*;

/**
 * Created by mexic on 12/11/2017.
 */
public class FriendlyPlug extends Plugins {
    @Override
    public void Introduction() {
        System.out.println("Hey there! How are ya?");
    }

    @Override
    public void SmallTalk() {
        System.out.println("Technology is here to help mankind achieve it's highest potential. ");
    }

    @Override
    public void Conclusion() {
        System.out.println("It's about time for me to head out. Bye!");
    }
}
