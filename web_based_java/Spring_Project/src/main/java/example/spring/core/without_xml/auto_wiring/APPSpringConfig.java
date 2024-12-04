package example.spring.core.without_xml.auto_wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class APPSpringConfig {
	//Configuration of 3 beans:Engine,MusicSystem,Car
	@Bean("carEngine")
	@Primary
	public Engine getEngine() {
		Engine eng=new Engine("1600 CC","Petrol");
		return eng;
	}
	
	
	@Bean("carSuperEngine")

	public Engine getSuperEngine() {
		Engine eng=new Engine("20000 CC","Petrol");
		return eng;
	}
	
	@Bean("carMusicSystem")
	public MusicSystem getMusicSystem() {
		MusicSystem ms=new MusicSystem();
		ms.setMake("Sony");
		ms.setSoundEffect("Dolby");
		return ms;
	}

	
	
	@Bean("myCar")
	public Car getMyCar() {
		Car myCar=new Car();
		myCar.setModel("Creta");
		myCar.setMake("Hyundai");
		myCar.setPrice(16500000);
		return myCar;
	}
}
