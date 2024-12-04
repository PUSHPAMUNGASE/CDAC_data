package third.last;

import org.springframework.stereotype.Component;
 //Ass9igning an ID:myFinalComp  to this component so that it can be accessed using the same
@Component("myFinalComp")
public class FinalTestComponent {
public void doTest() {
	System.out.println("FinalTestComponent test succeeded");
}
}
