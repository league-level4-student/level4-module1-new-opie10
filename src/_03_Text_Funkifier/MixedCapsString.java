package _03_Text_Funkifier;

import java.lang.reflect.Array;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String done = "";
		// TODO Auto-generated method stub
	char[] unfunk=	unfunkifiedText.toCharArray();
	for (int i = 0; i < unfunk.length; i++) {
		if (i==0||i%2==0) {
			
			char e =Character.toLowerCase(unfunk[i]);
			
			done =done+e;
		}
		else {
			
			char e = Character.toUpperCase(unfunk[i]);
			
			done =done+e;
		}
		
	}
	
	
	return done;
	}

}
