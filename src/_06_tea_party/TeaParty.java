package _06_tea_party;

public class TeaParty {
public String welcome(String name, boolean isWoman, boolean isKnighted) {
        String res = "Hello ";
        if(isWoman==true) {
        if (isKnighted) {
			res += "Lady ";
		}
        else {
			res += "Ms. ";
		}
        
        	   }
        else {
			if (isKnighted) {
				res += "Sir ";
			}
			else {
				res+= "Mr. ";
			}
					}
        res+=name;
        return res;

        
    }

}
