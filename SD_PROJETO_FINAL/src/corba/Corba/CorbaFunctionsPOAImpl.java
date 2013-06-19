package corba.Corba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import util.Paths;

public class CorbaFunctionsPOAImpl extends CorbaFunctionsPOA{

	private static String pathRestaurante = Paths.RESTAURANTE.getPath();
	private static String pathCinema = Paths.CINEMA.getPath();
	private static String pathTeatro = Paths.TEATRO.getPath();

	/**
	 * Adiciona um Restaurante no final do arquivo
	 * 
	 * @param id
	 * @param nome
	 * @param capacidade
	 * @return
	 */
	@Override
	public boolean addRestaurante(short id, String nome, short capacidade) {
		boolean cadastroRealizado = true;

		if (!new File(pathRestaurante).exists()) {
			FileWriter outFile;
			try {
				outFile = new FileWriter(pathRestaurante, true);
				PrintWriter out = new PrintWriter(outFile);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File inFile = new File(pathRestaurante);

		if (!inFile.isFile()) {
			System.out.println("Não é um arquivo!");
			cadastroRealizado = false;
		}

		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(pathRestaurante));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

			String line = null;

			do {
				line = br.readLine();

				if (line == null) {
					break;
				}

				pw.println(line);

				pw.flush();
			} while (line != null);

			System.out.println("Cadastrado Restaurante: "+id+";"+nome+";"+capacidade);
			
			pw.println(id+";"+nome+";"+capacidade);
			pw.flush();

			pw.close();
			br.close();

			if (!inFile.delete()) {
				System.out.println("Could not delete file");
				cadastroRealizado = false;
			}

			if (!tempFile.renameTo(inFile)) {
				System.out.println("Could not rename file");
				cadastroRealizado = false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			cadastroRealizado = false;
		} catch (IOException e) {
			e.printStackTrace();
			cadastroRealizado = false;
		}

		return cadastroRealizado;
	}

	/**
	 * Adiciona um Cinema no final do arquivo
	 * 
	 * @param id
	 * @param nome
	 * @param idFilme
	 * @param nomeFilme
	 * @param horario
	 * @param capacidade
	 * @return
	 */
	@Override
	public boolean addCinema(short id, String nome, short idFilme, String nomeFilme, short horario, short capacidade) {
		boolean cadastroRealizado = true;

		if (!new File(pathCinema).exists()) {
			FileWriter outFile;
			try {
				outFile = new FileWriter(pathCinema, true);
				PrintWriter out = new PrintWriter(outFile);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File inFile = new File(pathCinema);

		if (!inFile.isFile()) {
			System.out.println("Não é um arquivo!");
			cadastroRealizado = false;
		}

		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(pathCinema));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

			String line = null;

			do {
				line = br.readLine();

				if (line == null) {
					break;
				}

				pw.println(line);

				pw.flush();
			} while (line != null);

			System.out.println("Cadastrado Cinema: "+id+";"+nome+";"+idFilme+";"+nomeFilme+";"+horario+";"+capacidade);
			
			pw.println(id+";"+nome+";"+idFilme+";"+nomeFilme+";"+horario+";"+capacidade);
			pw.flush();

			pw.close();
			br.close();

			if (!inFile.delete()) {
				System.out.println("Could not delete file");
				cadastroRealizado = false;
			}

			if (!tempFile.renameTo(inFile)) {
				System.out.println("Could not rename file");
				cadastroRealizado = false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			cadastroRealizado = false;
		} catch (IOException e) {
			e.printStackTrace();
			cadastroRealizado = false;
		}

		return cadastroRealizado;
	}

	/**
	 * Adiciona um Teatro no final do arquivo
	 * 
	 * @param id
	 * @param nome
	 * @param idPeca
	 * @param nomePeca
	 * @param horario
	 * @param capacidade
	 * @return
	 */
	@Override
	public boolean addTeatro(short id, String nome, short idPeca, String nomePeca, short horario, short capacidade) {
		boolean cadastroRealizado = true;

		if (!new File(pathTeatro).exists()) {
			FileWriter outFile;
			try {
				outFile = new FileWriter(pathTeatro, true);
				PrintWriter out = new PrintWriter(outFile);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File inFile = new File(pathTeatro);

		if (!inFile.isFile()) {
			System.out.println("Não é um arquivo!");
			cadastroRealizado = false;
		}

		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(pathTeatro));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

			String line = null;

			do {
				line = br.readLine();

				if (line == null) {
					break;
				}

				pw.println(line);

				pw.flush();
			} while (line != null);

			System.out.println("Cadastrado Teatro: "+id+";"+nome+";"+idPeca+";"+nomePeca+";"+horario+";"+capacidade);
			
			pw.println(id+";"+nome+";"+idPeca+";"+nomePeca+";"+horario+";"+capacidade);
			pw.flush();

			pw.close();
			br.close();

			if (!inFile.delete()) {
				System.out.println("Could not delete file");
				cadastroRealizado = false;
			}

			if (!tempFile.renameTo(inFile)) {
				System.out.println("Could not rename file");
				cadastroRealizado = false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			cadastroRealizado = false;
		} catch (IOException e) {
			e.printStackTrace();
			cadastroRealizado = false;
		}
		
		return cadastroRealizado;
	}

	@Override
	public String recuperaRestaurante(short id) {
		
		String restaurante = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathRestaurante));

			try {
				String line = br.readLine();
				
				System.out.println("Procurando Restaurante: "+id);
				
				while (line != null) {
					String[] restaurantes = line.split(";");
					if(Integer.parseInt(restaurantes[0]) == id){
						restaurante = line;
						System.out.println("Recuperado Restaurante: "+restaurante);
						break;
					}else{
						line = br.readLine();
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return restaurante;
	}

	@Override
	public String recuperaCinema(short idCinema, short idFilme, short idHorario) {
		
		String cinema = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathCinema));

			try {
				String line = br.readLine();
				
				System.out.println("Procurando Cinema: "+idCinema+";"+idFilme+";"+idHorario);
				
				while (line != null) {
					String[] cinemas = line.split(";");
					if(Integer.parseInt(cinemas[0]) == idCinema 
							&& Integer.parseInt(cinemas[2]) == idFilme
							&& Integer.parseInt(cinemas[4]) == idHorario){
						cinema = line;
						System.out.println("Recuperado Cinema: "+cinema);
						break;
					}else{
						line = br.readLine();
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return cinema;
	}

	@Override
	public String recuperaTeatro(short idTeatro, short idPeca, short idHorario) {
		
		String teatro = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathTeatro));

			try {
				String line = br.readLine();
				
				System.out.println("Procurando Teatro: "+idTeatro+";"+idPeca+";"+idHorario);
				
				while (line != null) {
					String[] teatros = line.split(";");
					if(Integer.parseInt(teatros[0]) == idTeatro 
							&& Integer.parseInt(teatros[2]) == idPeca
							&& Integer.parseInt(teatros[4]) == idHorario){
						teatro = line;
						System.out.println("Recuperado Teatro: "+teatro);
						break;
					}else{
						line = br.readLine();
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return teatro;
	}

}