package com.ocajexam.chapter.five;

/**
 * @since 14/01/2020
 * @author willian
 *
 *         Existem quatro modificadores de acesso: private,
 *         package-private(padr�o), protected e public
 */
@SuppressWarnings("unused")
public class ModificadorDeAcesso {

	public static void main(String[] args) {

		/* Exemplo de sintaxe de um m�todo */

		// Partes de um m�todo
		
		// <Modificador de acesso> <Tipo de retorno> <Identifica��o do m�todo> (<Lista de par�metros>) {
		// <Corpo do m�todo>
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
