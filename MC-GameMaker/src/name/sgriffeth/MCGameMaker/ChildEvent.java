package name.sgriffeth.MCGameMaker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})
public @interface ChildEvent {
	
	public boolean isAbstract() default false;
	//public boolean parentAbstract() default false;
	public Command.SupportedEvent parent() default Command.SupportedEvent.AreaEffectCloudApplyEvent;
}
