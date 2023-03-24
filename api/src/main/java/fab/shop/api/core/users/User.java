package fab.shop.api.core.users;

public class User {
	
	private final Integer id;
	private final String name;
	private final String nick;
	private final String password;
	
	public User(Integer id, String name, String nick, String password) {
		super();
		this.id = id;
		this.name = name;
		this.nick = nick;
		this.password = password;
	}
	
	public User() {
		super();
		
		this.id = 0;
		this.name = null;
		this.nick = null;
		this.password = null;	
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getNick() {
		return nick;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	
	

}
