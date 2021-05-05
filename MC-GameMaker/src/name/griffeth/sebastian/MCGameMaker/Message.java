package name.griffeth.sebastian.MCGameMaker;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class Message {
	
	private String msg;
	private ChatMessageType type;
	private TextComponent text;
	
	public Message(String msg,ChatMessageType type) {
		this.msg=msg;
		this.type=type;
	}
	
	public Message(String msg,ClickEvent action,HoverEvent action2) {
		TextComponent text = new TextComponent(msg);
		text.setClickEvent(action);
		text.setHoverEvent(action2);
		this.text=text;
	}
	
	public String getMessage() {
		return msg;
	}
	
	public void setMessage(String msg) {
		this.msg=msg;
	}
	
	public TextComponent getTextComponent() {
		return text;
	}
	
	public void setTextComponent(TextComponent text) {
		this.text=text;
	}
	
	public ChatMessageType getType() {
		return type;
	}
	
	public void setType(ChatMessageType type) {
		this.type=type;
	}
	
}
