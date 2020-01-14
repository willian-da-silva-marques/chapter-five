package com.ocajexam.chapter.five;

/**
 * @since 14/01/2020
 * @author willian
 *
 *         Existem quatro modificadores de acesso: private,
 *         package-private(padrão), protected e public
 */
@SuppressWarnings("unused")
public class ModificadorDeAcesso {

	public static void main(String[] args) {

		/* Exemplo de sintaxe de um método */

		// Partes de um método
		
		// <Modificador de acesso> <Tipo de retorno> <Identificação do método> (<Lista de parâmetros>) {
		// <Corpo do método>
		// }

	}

	// Exemplo usando o modificador private
	private int getScorePrivate() {
		return 0;
	}

	// Exemplo usando o modificador package-private
	int getScorePackagePrivate() {
		return 0;
	}
	
	// Exemplo usando o modificador protected
	protected int getScoreProtected() {
		return 0;
	}
	
	// Exemplo usando o modificador public
	public int getScorePublic() {
		return 0;
	}
}
