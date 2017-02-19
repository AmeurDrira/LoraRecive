package soitech;

import a.a.a.a;

public class Client extends a {

	public Client(String arg0, String arg1) {
		super(arg0, arg1);
	}

	@Override
	public void a(String channel, String message) {
		System.out.println("IotTunisa  " + channel + ": " + message);

	}

	public static void main(String[] args) {
		Client client = new Client("lora", "soitech.cloudapp.net");
		client.start();

	}

}
