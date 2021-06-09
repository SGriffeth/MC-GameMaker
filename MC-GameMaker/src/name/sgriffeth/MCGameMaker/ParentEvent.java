package name.sgriffeth.MCGameMaker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})
public @interface ParentEvent {
	public boolean isAbstract();
	public Command.SupportedEvent[] subclasses() default {};
}
