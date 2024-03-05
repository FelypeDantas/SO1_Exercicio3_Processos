package controller;

public class DistroController {
	
	public DistroController() {
		super();
	}

	private String os() {
		String os = System.getProperty("os.name");
		String arch = System.getProperty("os.arch");
		String version = System.getProperty("os.version");
		return os + " - v. " + version + " - arch. " + arch;
	}
	
	public void exibeDistro(String process) {
		
		//caso seja Windows retorna o nome, versão e arquitetura do SO;
		if(os().contains("Windows")) {
			
			System.out.println(os());
			
		} else if(os().contains("Linux")) {
			System.out.println(os());
			StringBuffer buffer = new StringBuffer();
			buffer.append("cd /home");
			buffer.append(" ");
			buffer.append(process);
		}
	}
}
