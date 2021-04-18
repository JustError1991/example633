import anotherfirm.*;

import java.util.Arrays;

public class HackIt extends Secret{

    public HackIt(){
        super.getSecret();
    }

    public static void main(String[] args) {
        // Call the method getSecret() of class anotherfirm.Secret
        // from package "anotherfirm" here
        // The output will be the code to the excercise
        // ...
//        Secret secret = new Secret();
//        secret.getSecret();
        HackIt secret = new HackIt();

    }
}