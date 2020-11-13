package veryEasy;

public class BrokenBridge {

    public static boolean isSafeBridge(String bridge) {
        if(bridge.contains(" ")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSafeBridge("hi   hello"));
    }
}

/*
Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).
Examples
isSafeBridge("####") ➞ true
isSafeBridge("## ####") ➞ false
isSafeBridge("#") ➞ true
Notes
You can expect the bridge's ends are connected to its surrounding.
 */
