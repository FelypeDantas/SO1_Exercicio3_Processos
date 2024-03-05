package view;

import controller.DistroController;

public class MainDistro {

	public static void main(String[] args) {
		DistroController distro = new DistroController();
		
		String process = "cat /etc/os-release";
		
		distro.exibeDistro(process);

	}

}
