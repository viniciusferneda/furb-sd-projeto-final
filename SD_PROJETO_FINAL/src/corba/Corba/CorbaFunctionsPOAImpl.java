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

	@Override
	public boolean retiraCapacidadeRestaurante(short id, short capacidade) {
		
		boolean retiradaRealizada = true;
		
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
			retiradaRealizada = false;
		}

		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(pathRestaurante));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

			String line = null;

			System.out.println("Retirando "+capacidade+" de capacidade do Restaurante "+id);
			
			do {
				line = br.readLine();

				if (line == null) {
					break;
				}
				
				String[] restaurantes = line.split(";");
				if(Integer.parseInt(restaurantes[0]) == id){
					restaurantes[2] = String.valueOf((Short.parseShort(restaurantes[2])-capacidade)); 
					
					line = restaurantes[0]+";"+restaurantes[1]+";"+restaurantes[2];
					
					System.out.println("Retirada "+capacidade+" de capacidade do Restaurante "+id);
					System.out.println("Capacidade atual é de "+restaurantes[2]+" de capacidade do Restaurante "+id);
				}
				
				pw.println(line);

				pw.flush();
			} while (line != null);

			pw.close();
			br.close();

			if (!inFile.delete()) {
				System.out.println("Could not delete file");
				retiradaRealizada = false;
			}

			if (!tempFile.renameTo(inFile)) {
				System.out.println("Could not rename file");
				retiradaRealizada = false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			retiradaRealizada = false;
		} catch (IOException e) {
			e.printStackTrace();
			retiradaRealizada = false;
		}

		return retiradaRealizada;

	}

	@Override
	public boolean retiraCapacidadeCinema(short idCinema, short idFilme, short idHorario, short capacidade) {

		boolean retiradaRealizada = true;
		
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
			retiradaRealizada = false;
		}

		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(pathCinema));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

			String line = null;

			System.out.println("Retirando "+capacidade+" de capacidade do Cinema "+idCinema+" do Filme "+idFilme+" do horario "+idHorario);
			
			do {
				line = br.readLine();

				if (line == null) {
					break;
				}
				
				String[] cinemas = line.split(";");
				if(Integer.parseInt(cinemas[0]) == idCinema
						&& Integer.parseInt(cinemas[2]) == idFilme
						&& Integer.parseInt(cinemas[4]) == idHorario){
					
					cinemas[5] = String.valueOf((Short.parseShort(cinemas[5])-capacidade)); 
					
					line = cinemas[0]+";"+cinemas[1]+";"+cinemas[2]+";"+cinemas[3]+";"+cinemas[4]+";"+cinemas[5];
					
					System.out.println("Retirada "+capacidade+" de capacidade do Cinema "+idCinema+" do Filme "+idFilme+" do horario "+idHorario);
					System.out.println("Capacidade atual é de "+cinemas[5]+" de capacidade do Restaurante "+idCinema+" do Filme "+idFilme+" do horario "+idHorario);
				}
				
				pw.println(line);

				pw.flush();
			} while (line != null);

			pw.close();
			br.close();

			if (!inFile.delete()) {
				System.out.println("Could not delete file");
				retiradaRealizada = false;
			}

			if (!tempFile.renameTo(inFile)) {
				System.out.println("Could not rename file");
				retiradaRealizada = false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			retiradaRealizada = false;
		} catch (IOException e) {
			e.printStackTrace();
			retiradaRealizada = false;
		}

		return retiradaRealizada;
	}

	@Override
	public boolean retiraCapacidadeTeatro(short idTeatro, short idPeca, short idHorario, short capacidade) {
		
		boolean retiradaRealizada = true;
		
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
			retiradaRealizada = false;
		}

		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(pathTeatro));
			PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

			String line = null;

			System.out.println("Retirando "+capacidade+" de capacidade do teatro "+idTeatro+" da Peça "+idPeca+" do horario "+idHorario);
			
			do {
				line = br.readLine();

				if (line == null) {
					break;
				}
				
				String[] teatros = line.split(";");
				if(Integer.parseInt(teatros[0]) == idTeatro
						&& Integer.parseInt(teatros[2]) == idPeca
						&& Integer.parseInt(teatros[4]) == idHorario){
					
					teatros[5] = String.valueOf((Short.parseShort(teatros[5])-capacidade)); 
					
					line = teatros[0]+";"+teatros[1]+";"+teatros[2]+";"+teatros[3]+";"+teatros[4]+";"+teatros[5];
					
					System.out.println("Retirada "+capacidade+" de capacidade do Teatro "+idTeatro+" da Peça "+idPeca+" do horario "+idHorario);
					System.out.println("Capacidade atual é de "+teatros[5]+" de capacidade do Teatro "+idTeatro+" da Peça "+idPeca+" do horario "+idHorario);
				}
				
				pw.println(line);

				pw.flush();
			} while (line != null);

			pw.close();
			br.close();

			if (!inFile.delete()) {
				System.out.println("Could not delete file");
				retiradaRealizada = false;
			}

			if (!tempFile.renameTo(inFile)) {
				System.out.println("Could not rename file");
				retiradaRealizada = false;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			retiradaRealizada = false;
		} catch (IOException e) {
			e.printStackTrace();
			retiradaRealizada = false;
		}

		return retiradaRealizada;
	}

}