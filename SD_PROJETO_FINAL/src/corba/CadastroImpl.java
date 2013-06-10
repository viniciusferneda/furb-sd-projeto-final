package corba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import util.Paths;

public class CadastroImpl {

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
	public boolean addRestaurante(int id, String nome, int capacidade) {

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

			pw.println(id+";"+nome+";"+";"+capacidade);
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
	public boolean addCinema(int id, String nome, int idFilme, String nomeFilme, int horario, int capacidade) {

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
	public boolean addTeatro(int id, String nome, int idPeca, String nomePeca, int horario, int capacidade) {

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

}