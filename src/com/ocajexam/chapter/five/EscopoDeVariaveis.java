package com.ocajexam.chapter.five;

import com.ocajexam.chapter.five.model.Television;

/**
 * @since 14/01/2020
 * @author willian
 *
 *         O escopo é a seção de código que tem acesso a uma variável declarada.
 */
@SuppressWarnings("unused")
public class EscopoDeVariaveis {

	public static void main(String[] args) {
		// Variáveis locais
		sampleMethod();
		
		// Parâmetros de método(Java suporta até 255 parametros)
		int somarDuzentosECinquentaEQuatroParametros = somarDuzentosECinquentaEQuatroParametros(1, 2, 3, 4, 5, 6, 7, 8,
				9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
				35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
				61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
				87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
				110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130,
				131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151,
				152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172,
				173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193,
				194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214,
				215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235,
				236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254);
		System.out.printf("somarDuzentosECinquentaEQuatroParametros: %d%n", somarDuzentosECinquentaEQuatroParametros);
		
		// Parâmetros de método
		int soma = somarDuzentosECinquentaEQuatroParametros(1);
		System.out.printf("soma: %d%n", soma);
		
		// Variáveis de instância
		Television televisionOne = new Television(2, false);
		Television televisionTwo = new Television(7, false);
		System.out.println(televisionOne);
		System.out.println(televisionTwo);
	}

	/*
	 * Variáveis locais - São declaradas dentro dos métodos e como o nome sugere são
	 * usadas localmente
	 */
	private static void sampleMethod() { // Início do bloco A
		int totalCount = 0;
		for (int i = 0; i < 3; i++) { // Início do bloco B
			int forCount = 0;
			totalCount++;
			forCount++;
			{ // Início do bloco C
				int block1Count = 0;
				totalCount++;
				forCount++;
				block1Count++;
			} // Fim do bloco C
			{ // Início do bloco D
				int block2Count = 0;
				totalCount++;
				forCount++;
				block2Count++;
			} // Fim do bloco D
			/*
			 * Essas duas variáveis não tem relação com as variáveis de mesmo nome mostradas
			 * anteriormente
			 */
			int block1Count;
			int block2Count;
		} // Fim do bloco B
	} // Fim do bloco A

	/*
	 * Parâmetros de método - São passados para o método como argumentos pelo
	 * segmento de código chamador, seu escopo é o bloco do método inteiro
	 */
	public float findMilesPerHour(float milesTraveled, float hoursTraveled) {
		return milesTraveled / hoursTraveled;
	}

	public static int somarDuzentosECinquentaEQuatroParametros(int p1, int p2, int p3, int p4, int p5, int p6, int p7,
			int p8, int p9, int p10, int p11, int p12, int p13, int p14, int p15, int p16, int p17, int p18, int p19,
			int p20, int p21, int p22, int p23, int p24, int p25, int p26, int p27, int p28, int p29, int p30, int p31,
			int p32, int p33, int p34, int p35, int p36, int p37, int p38, int p39, int p40, int p41, int p42, int p43,
			int p44, int p45, int p46, int p47, int p48, int p49, int p50, int p51, int p52, int p53, int p54, int p55,
			int p56, int p57, int p58, int p59, int p60, int p61, int p62, int p63, int p64, int p65, int p66, int p67,
			int p68, int p69, int p70, int p71, int p72, int p73, int p74, int p75, int p76, int p77, int p78, int p79,
			int p80, int p81, int p82, int p83, int p84, int p85, int p86, int p87, int p88, int p89, int p90, int p91,
			int p92, int p93, int p94, int p95, int p96, int p97, int p98, int p99, int p100, int p101, int p102,
			int p103, int p104, int p105, int p106, int p107, int p108, int p109, int p110, int p111, int p112,
			int p113, int p114, int p115, int p116, int p117, int p118, int p119, int p120, int p121, int p122,
			int p123, int p124, int p125, int p126, int p127, int p128, int p129, int p130, int p131, int p132,
			int p133, int p134, int p135, int p136, int p137, int p138, int p139, int p140, int p141, int p142,
			int p143, int p144, int p145, int p146, int p147, int p148, int p149, int p150, int p151, int p152,
			int p153, int p154, int p155, int p156, int p157, int p158, int p159, int p160, int p161, int p162,
			int p163, int p164, int p165, int p166, int p167, int p168, int p169, int p170, int p171, int p172,
			int p173, int p174, int p175, int p176, int p177, int p178, int p179, int p180, int p181, int p182,
			int p183, int p184, int p185, int p186, int p187, int p188, int p189, int p190, int p191, int p192,
			int p193, int p194, int p195, int p196, int p197, int p198, int p199, int p200, int p201, int p202,
			int p203, int p204, int p205, int p206, int p207, int p208, int p209, int p210, int p211, int p212,
			int p213, int p214, int p215, int p216, int p217, int p218, int p219, int p220, int p221, int p222,
			int p223, int p224, int p225, int p226, int p227, int p228, int p229, int p230, int p231, int p232,
			int p233, int p234, int p235, int p236, int p237, int p238, int p239, int p240, int p241, int p242,
			int p243, int p244, int p245, int p246, int p247, int p248, int p249, int p250, int p251, int p252,
			int p253, int p254) {
		return p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10 + p11 + p12 + p13 + p14 + p15 + p16 + p17 + p18 + p19
				+ p20 + p21 + p22 + p23 + p24 + p25 + p26 + p27 + p28 + p29 + p30 + p31 + p32 + p33 + p34 + p35 + p36
				+ p37 + p38 + p39 + p40 + p41 + p42 + p43 + p44 + p45 + p46 + p47 + p48 + p49 + p50 + p51 + p52 + p53
				+ p54 + p55 + p56 + p57 + p58 + p59 + p60 + p61 + p62 + p63 + p64 + p65 + p66 + p67 + p68 + p69 + p70
				+ p71 + p72 + p73 + p74 + p75 + p76 + p77 + p78 + p79 + p80 + p81 + p82 + p83 + p84 + p85 + p86 + p87
				+ p88 + p89 + p90 + p91 + p92 + p93 + p94 + p95 + p96 + p97 + p98 + p99 + p100 + p101 + p102 + p103
				+ p104 + p105 + p106 + p107 + p108 + p109 + p110 + p111 + p112 + p113 + p114 + p115 + p116 + p117 + p118
				+ p119 + p120 + p121 + p122 + p123 + p124 + p125 + p126 + p127 + p128 + p129 + p130 + p131 + p132 + p133
				+ p134 + p135 + p136 + p137 + p138 + p139 + p140 + p141 + p142 + p143 + p144 + p145 + p146 + p147 + p148
				+ p149 + p150 + p151 + p152 + p153 + p154 + p155 + p156 + p157 + p158 + p159 + p160 + p161 + p162 + p163
				+ p164 + p165 + p166 + p167 + p168 + p169 + p170 + p171 + p172 + p173 + p174 + p175 + p176 + p177 + p178
				+ p179 + p180 + p181 + p182 + p183 + p184 + p185 + p186 + p187 + p188 + p189 + p190 + p191 + p192 + p193
				+ p194 + p195 + p196 + p197 + p198 + p199 + p200 + p201 + p202 + p203 + p204 + p205 + p206 + p207 + p208
				+ p209 + p210 + p211 + p212 + p213 + p214 + p215 + p216 + p217 + p218 + p219 + p220 + p221 + p222 + p223
				+ p224 + p225 + p226 + p227 + p228 + p229 + p230 + p231 + p232 + p233 + p234 + p235 + p236 + p237 + p238
				+ p239 + p240 + p241 + p242 + p243 + p244 + p245 + p246 + p247 + p248 + p249 + p250 + p251 + p252 + p253
				+ p254;
	}

	public static int somarDuzentosECinquentaEQuatroParametros(int p1) {
		int soma = 0;
		do {
			soma += p1;
			p1++;
		} while (p1 < 255);
		return soma;
	}
}