package example.spring.core.without_xml;

import org.springframework.stereotype.Component;

@Component //Marks this class as Managed Component
public class TestComponent {
public void doTest() {
	System.out.println("TestComponent test succeeded.");
}
}