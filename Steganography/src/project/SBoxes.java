package project;

public class SBoxes {
	
	public static byte[][] buildSBox(){
		byte[][] output = new byte[16][16];
		output[0][0]	=(byte)0x63;
		output[0][1]	=(byte)0x7c;
		output[0][2]	=(byte)0x77;
		output[0][3]	=(byte)0x7b;
		output[0][4]    =(byte)0xf2;
		output[0][5]	=(byte)0x6b;
		output[0][6]	=(byte)0x6f;
		output[0][7]	=(byte)0xc5;
		output[0][8]	=(byte)0x30;
		output[0][9]	=(byte)0x01;
		output[0][10]	=(byte)0x67;
		output[0][11]	=(byte)0x2b;
		output[0][12]	=(byte)0xfe;
		output[0][13]	=(byte)0xd7;
		output[0][14]	=(byte)0xab;
		output[0][15]	=(byte)0x76;
		output[1][0]	=(byte)0xca;
		output[1][1]	=(byte)0x82;
		output[1][2]	=(byte)0xc9;
		output[1][3]	=(byte)0x7d;
		output[1][4]	=(byte)0xfa;
		output[1][5]	=(byte)0x59;
		output[1][6]	=(byte)0x47;
		output[1][7]	=(byte)0xf0;
		output[1][8]	=(byte)0xad;
		output[1][9]	=(byte)0xd4;
		output[1][10]	=(byte)0xa2;
		output[1][11]	=(byte)0xaf;
		output[1][12]	=(byte)0x9c;
		output[1][13]	=(byte)0xa4;
		output[1][14]	=(byte)0x72;
		output[1][15]	=(byte)0xc0;
		output[2][0]	=(byte)0xb7;
		output[2][1]	=(byte)0xfd;
		output[2][2]	=(byte)0x93;
		output[2][3]	=(byte)0x26;
		output[2][4]	=(byte)0x36;
		output[2][5]	=(byte)0x3f;
		output[2][6]	=(byte)0xf7;
		output[2][7]	=(byte)0xcc;
		output[2][8]	=(byte)0x34;
		output[2][9]	=(byte)0xa5;
		output[2][10]	=(byte)0xe5;
		output[2][11]	=(byte)0xf1;
		output[2][12]	=(byte)0x71;
		output[2][13]	=(byte)0xd8;
		output[2][14]	=(byte)0x31;
		output[2][15]	=(byte)0x15;
		output[3][0]	=(byte)0x04;
		output[3][1]	=(byte)0xc7;
		output[3][2]	=(byte)0x23;
		output[3][3]	=(byte)0xc3;
		output[3][4]	=(byte)0x18;
		output[3][5]	=(byte)0x96;
		output[3][6]	=(byte)0x05;
		output[3][7]	=(byte)0x9a;
		output[3][8]	=(byte)0x07;
		output[3][9]	=(byte)0x12;
		output[3][10]	=(byte)0x80;
		output[3][11]	=(byte)0xe2;
		output[3][12]	=(byte)0xeb;
		output[3][13]	=(byte)0x27;
		output[3][14]	=(byte)0xb2;
		output[3][15]	=(byte)0x75;
		output[4][0]	=(byte)0x09;
		output[4][1]	=(byte)0x83;
		output[4][2]	=(byte)0x2c;
		output[4][3]	=(byte)0x1a;
		output[4][4]	=(byte)0x1b;
		output[4][5]	=(byte)0x6e;
		output[4][6]	=(byte)0x5a;
		output[4][7]	=(byte)0xa0;
		output[4][8]	=(byte)0x52;
		output[4][9]	=(byte)0x3b;
		output[4][10]	=(byte)0xd6;
		output[4][11]	=(byte)0xb3;
		output[4][12]	=(byte)0x29;
		output[4][13]	=(byte)0xe3;
		output[4][14]	=(byte)0x2f;
		output[4][15]	=(byte)0x84;
		output[5][0]	=(byte)0x53;
		output[5][1]	=(byte)0xd1;
		output[5][2]	=(byte)0x00;
		output[5][3]	=(byte)0xed;
		output[5][4]	=(byte)0x20;
		output[5][5]	=(byte)0xfc;
		output[5][6]	=(byte)0xb1;
		output[5][7]	=(byte)0x5b;
		output[5][8]	=(byte)0x6a;
		output[5][9]	=(byte)0xcb;
		output[5][10]	=(byte)0xbe;
		output[5][11]	=(byte)0x39;
		output[5][12]	=(byte)0x4a;
		output[5][13]	=(byte)0x4c;
		output[5][14]	=(byte)0x58;
		output[5][15]	=(byte)0xcf;
		output[6][0]	=(byte)0xd0;
		output[6][1]	=(byte)0xef;
		output[6][2]	=(byte)0xaa;
		output[6][3]	=(byte)0xfb;
		output[6][4]	=(byte)0x43;
		output[6][5]	=(byte)0x4d;
		output[6][6]	=(byte)0x33;
		output[6][7]	=(byte)0x85;
		output[6][8]	=(byte)0x45;
		output[6][9]	=(byte)0xf9;
		output[6][10]	=(byte)0x02;
		output[6][11]	=(byte)0x7f;
		output[6][12]	=(byte)0x50;
		output[6][13]	=(byte)0x3c;
		output[6][14]	=(byte)0x9f;
		output[6][15]	=(byte)0xa8;
		output[7][0]	=(byte)0x51;
		output[7][1]	=(byte)0xa3;
		output[7][2]	=(byte)0x40;
		output[7][3]	=(byte)0x8f;
		output[7][4]	=(byte)0x92;
		output[7][5]	=(byte)0x9d;
		output[7][6]	=(byte)0x38;
		output[7][7]	=(byte)0xf5;
		output[7][8]	=(byte)0xbc;
		output[7][9]	=(byte)0xb6;
		output[7][10]	=(byte)0xda;
		output[7][11]	=(byte)0x21;
		output[7][12]	=(byte)0x10;
		output[7][13]	=(byte)0xff;
		output[7][14]	=(byte)0xf3;
		output[7][15]	=(byte)0xd2;
		output[8][0]	=(byte)0xcd;
		output[8][1]	=(byte)0x0c;
		output[8][2]	=(byte)0x13;
		output[8][3]	=(byte)0xec;
		output[8][4]	=(byte)0x5f;
		output[8][5]	=(byte)0x97;
		output[8][6]	=(byte)0x44;
		output[8][7]	=(byte)0x17;
		output[8][8]	=(byte)0xc4;
		output[8][9]	=(byte)0xa7;
		output[8][10]	=(byte)0x7e;
		output[8][11]	=(byte)0x3d;
		output[8][12]	=(byte)0x64;
		output[8][13]	=(byte)0x5d;
		output[8][14]	=(byte)0x19;
		output[8][15]	=(byte)0x73;
		output[9][0]	=(byte)0x60;
		output[9][1]	=(byte)0x81;
		output[9][2]	=(byte)0x4f;
		output[9][3]	=(byte)0xdc;
		output[9][4]	=(byte)0x22;
		output[9][5]	=(byte)0x2a;
		output[9][6]	=(byte)0x90;
		output[9][7]	=(byte)0x88;
		output[9][8]	=(byte)0x46;
		output[9][9]	=(byte)0xee;
		output[9][10]	=(byte)0xb8;
		output[9][11]	=(byte)0x14;
		output[9][12]	=(byte)0xde;
		output[9][13]	=(byte)0x5e;
		output[9][14]	=(byte)0x0b;
		output[9][15]	=(byte)0xdb;
		output[10][0]	=(byte)0xe0;
		output[10][1]	=(byte)0x32;
		output[10][2]	=(byte)0x3a;
		output[10][3]	=(byte)0x0a;
		output[10][4]	=(byte)0x49;
		output[10][5]	=(byte)0x06;
		output[10][6]	=(byte)0x24;
		output[10][7]	=(byte)0x5c;
		output[10][8]	=(byte)0xc2;
		output[10][9]	=(byte)0xd3;
		output[10][10]	=(byte)0xac;
		output[10][11]	=(byte)0x62;
		output[10][12]	=(byte)0x91;
		output[10][13]	=(byte)0x95;
		output[10][14]	=(byte)0xe4;
		output[10][15]	=(byte)0x79;
		output[11][0]	=(byte)0xe7;
		output[11][1]	=(byte)0xc8;
		output[11][2]	=(byte)0x37;
		output[11][3]	=(byte)0x6d;
		output[11][4]	=(byte)0x8d;
		output[11][5]	=(byte)0xd5;
		output[11][6]	=(byte)0x4e;
		output[11][7]	=(byte)0xa9;
		output[11][8]	=(byte)0x6c;
		output[11][9]	=(byte)0x56;
		output[11][10]	=(byte)0xf4;
		output[11][11]	=(byte)0xea;
		output[11][12]	=(byte)0x65;
		output[11][13]	=(byte)0x7a;
		output[11][14]	=(byte)0xae;
		output[11][15]	=(byte)0x08;
		output[12][0]	=(byte)0xba;
		output[12][1]	=(byte)0x78;
		output[12][2]	=(byte)0x25;
		output[12][3]	=(byte)0x2e;
		output[12][4]	=(byte)0x1c;
		output[12][5]	=(byte)0xa6;
		output[12][6]	=(byte)0xb4;
		output[12][7]	=(byte)0xc6;
		output[12][8]	=(byte)0xe8;
		output[12][9]	=(byte)0xdd;
		output[12][10]	=(byte)0x74;
		output[12][11]	=(byte)0x1f;
		output[12][12]	=(byte)0x4b;
		output[12][13]	=(byte)0xbd;
		output[12][14]	=(byte)0x8b;
		output[12][15]	=(byte)0x8a;
		output[13][0]	=(byte)0x70;
		output[13][1]	=(byte)0x3e;
		output[13][2]	=(byte)0xb5;
		output[13][3]	=(byte)0x66;
		output[13][4]	=(byte)0x48;
		output[13][5]	=(byte)0x03;
		output[13][6]	=(byte)0xf6;
		output[13][7]	=(byte)0x0e;
		output[13][8]	=(byte)0x61;
		output[13][9]	=(byte)0x35;
		output[13][10]	=(byte)0x57;
		output[13][11]	=(byte)0xb9;
		output[13][12]	=(byte)0x86;
		output[13][13]	=(byte)0xc1;
		output[13][14]	=(byte)0x1d;
		output[13][15]	=(byte)0x9e;
		output[14][0]	=(byte)0xe1;
		output[14][1]	=(byte)0xf8;
		output[14][2]	=(byte)0x98;
		output[14][3]	=(byte)0x11;
		output[14][4]	=(byte)0x69;
		output[14][5]	=(byte)0xd9;
		output[14][6]	=(byte)0x8e;
		output[14][7]	=(byte)0x94;
		output[14][8]	=(byte)0x9b;
		output[14][9]	=(byte)0x1e;
		output[14][10]	=(byte)0x87;
		output[14][11]	=(byte)0xe9;
		output[14][12]	=(byte)0xce;
		output[14][13]	=(byte)0x55;
		output[14][14]	=(byte)0x28;
		output[14][15]	=(byte)0xdf;
		output[15][0]	=(byte)0x8c;
		output[15][1]	=(byte)0xa1;
		output[15][2]	=(byte)0x89;
		output[15][3]	=(byte)0x0d;
		output[15][4]	=(byte)0xbf;
		output[15][5]	=(byte)0xe6;
		output[15][6]	=(byte)0x42;
		output[15][7]	=(byte)0x68;
		output[15][8]	=(byte)0x41;
		output[15][9]	=(byte)0x99;
		output[15][10]	=(byte)0x2d;
		output[15][11]	=(byte)0x0f;
		output[15][12]	=(byte)0xb0;
		output[15][13]	=(byte)0x54;
		output[15][14]	=(byte)0xbb;
		output[15][15]	=(byte)0x16;
		return output;
	}
	
	public static byte[][] buildISBox(){
		byte[][] output = new byte[16][16];
		output[0][0] =(byte)0x52;
		output[0][1] =(byte)0x09;
		output[0][2] =(byte)0x6a;
		output[0][3] =(byte)0xd5;
		output[0][4]  =(byte)0x30;
		output[0][5] =(byte)0x36;
		output[0][6] =(byte)0xa5;
		output[0][7] =(byte)0x38;
		output[0][8] =(byte)0xbf;
		output[0][9] =(byte)0x40;
		output[0][10] =(byte)0xa3;
		output[0][11] =(byte)0x9e;
		output[0][12] =(byte)0x81;
		output[0][13] =(byte)0xf3;
		output[0][14] =(byte)0xd7;
		output[0][15] =(byte)0xfb;
		output[1][0] =(byte)0x7c;
		output[1][1] =(byte)0xe3;
		output[1][2] =(byte)0x39;
		output[1][3] =(byte)0x82;
		output[1][4] =(byte)0x9b;
		output[1][5] =(byte)0x2f;
		output[1][6] =(byte)0xff;
		output[1][7] =(byte)0x87;
		output[1][8] =(byte)0x34;
		output[1][9] =(byte)0x8e;
		output[1][10] =(byte)0x43;
		output[1][11] =(byte)0x44;
		output[1][12] =(byte)0xc4;
		output[1][13] =(byte)0xde;
		output[1][14] =(byte)0xe9;
		output[1][15] =(byte)0xcb;
		output[2][0] =(byte)0x54;
		output[2][1] =(byte)0x7b;
		output[2][2] =(byte)0x94;
		output[2][3] =(byte)0x32;
		output[2][4] =(byte)0xa6;
		output[2][5] =(byte)0xc2;
		output[2][6] =(byte)0x23;
		output[2][7] =(byte)0x3d;
		output[2][8] =(byte)0xee;
		output[2][9] =(byte)0x4c;
		output[2][10] =(byte)0x95;
		output[2][11] =(byte)0x0b;
		output[2][12] =(byte)0x42;
		output[2][13] =(byte)0xfa;
		output[2][14] =(byte)0xc3;
		output[2][15] =(byte)0x4e;
		output[3][0] =(byte)0x08;
		output[3][1] =(byte)0x2e;
		output[3][2] =(byte)0xa1;
		output[3][3] =(byte)0x66;
		output[3][4] =(byte)0x28;
		output[3][5] =(byte)0xd9;
		output[3][6] =(byte)0x24;
		output[3][7] =(byte)0xb2;
		output[3][8] =(byte)0x76;
		output[3][9] =(byte)0x5b;
		output[3][10] =(byte)0xa2;
		output[3][11] =(byte)0x49;
		output[3][12] =(byte)0x6d;
		output[3][13] =(byte)0x8b;
		output[3][14] =(byte)0xd1;
		output[3][15] =(byte)0x25;
		output[4][0] =(byte)0x72;
		output[4][1] =(byte)0xf8;
		output[4][2] =(byte)0xf6;
		output[4][3] =(byte)0x64;
		output[4][4] =(byte)0x86;
		output[4][5] =(byte)0x68;
		output[4][6] =(byte)0x98;
		output[4][7] =(byte)0x16;
		output[4][8] =(byte)0xd4;
		output[4][9] =(byte)0xa4;
		output[4][10] =(byte)0x5c;
		output[4][11] =(byte)0xcc;
		output[4][12] =(byte)0x5d;
		output[4][13] =(byte)0x65;
		output[4][14] =(byte)0xb6;
		output[4][15] =(byte)0x92;
		output[5][0] =(byte)0x6c;
		output[5][1] =(byte)0x70;
		output[5][2] =(byte)0x48;
		output[5][3] =(byte)0x50;
		output[5][4] =(byte)0xfd;
		output[5][5] =(byte)0xed;
		output[5][6] =(byte)0xb9;
		output[5][7] =(byte)0xda;
		output[5][8] =(byte)0x5e;
		output[5][9] =(byte)0x15;
		output[5][10] =(byte)0x46;
		output[5][11] =(byte)0x57;
		output[5][12] =(byte)0xa7;
		output[5][13] =(byte)0x8d;
		output[5][14] =(byte)0x9d;
		output[5][15] =(byte)0x84;
		output[6][0] =(byte)0x90;
		output[6][1] =(byte)0xd8;
		output[6][2] =(byte)0xab;
		output[6][3] =(byte)0x00;
		output[6][4] =(byte)0x8c;
		output[6][5] =(byte)0xbc;
		output[6][6] =(byte)0xd3;
		output[6][7] =(byte)0x0a;
		output[6][8] =(byte)0xf7;
		output[6][9] =(byte)0xe4;
		output[6][10] =(byte)0x58;
		output[6][11] =(byte)0x05;
		output[6][12] =(byte)0xb8;
		output[6][13] =(byte)0xb3;
		output[6][14] =(byte)0x45;
		output[6][15] =(byte)0x06;
		output[7][0] =(byte)0xd0;
		output[7][1] =(byte)0x2c;
		output[7][2] =(byte)0x1e;
		output[7][3] =(byte)0x8f;
		output[7][4] =(byte)0xca;
		output[7][5] =(byte)0x3f;
		output[7][6] =(byte)0x0f;
		output[7][7] =(byte)0x02;
		output[7][8] =(byte)0xc1;
		output[7][9] =(byte)0xaf;
		output[7][10] =(byte)0xbd;
		output[7][11] =(byte)0x03;
		output[7][12] =(byte)0x01;
		output[7][13] =(byte)0x13;
		output[7][14] =(byte)0x8a;
		output[7][15] =(byte)0x6b;
		output[8][0] =(byte)0x3a;
		output[8][1] =(byte)0x91;
		output[8][2] =(byte)0x11;
		output[8][3] =(byte)0x41;
		output[8][4] =(byte)0x4f;
		output[8][5] =(byte)0x67;
		output[8][6] =(byte)0xdc;
		output[8][7] =(byte)0xea;
		output[8][8] =(byte)0x97;
		output[8][9] =(byte)0xf2;
		output[8][10] =(byte)0xcf;
		output[8][11] =(byte)0xce;
		output[8][12] =(byte)0xf0;
		output[8][13] =(byte)0xb4;
		output[8][14] =(byte)0xe6;
		output[8][15] =(byte)0x73;
		output[9][0] =(byte)0x96;
		output[9][1] =(byte)0xac;
		output[9][2] =(byte)0x74;
		output[9][3] =(byte)0x22;
		output[9][4] =(byte)0xe7;
		output[9][5] =(byte)0xad;
		output[9][6] =(byte)0x35;
		output[9][7] =(byte)0x85;
		output[9][8] =(byte)0xe2;
		output[9][9] =(byte)0xf9;
		output[9][10] =(byte)0x37;
		output[9][11] =(byte)0xe8;
		output[9][12] =(byte)0x1c;
		output[9][13] =(byte)0x75;
		output[9][14] =(byte)0xdf;
		output[9][15] =(byte)0x6e;
		output[10][0] =(byte)0x47;
		output[10][1] =(byte)0xf1;
		output[10][2] =(byte)0x1a;
		output[10][3] =(byte)0x71;
		output[10][4] =(byte)0x1d;
		output[10][5] =(byte)0x29;
		output[10][6] =(byte)0xc5;
		output[10][7] =(byte)0x89;
		output[10][8] =(byte)0x6f;
		output[10][9] =(byte)0xb7;
		output[10][10] =(byte)0x62;
		output[10][11] =(byte)0x0e;
		output[10][12] =(byte)0xaa;
		output[10][13] =(byte)0x18;
		output[10][14] =(byte)0xbe;
		output[10][15] =(byte)0x1b;
		output[11][0] =(byte)0xfc;
		output[11][1] =(byte)0x56;
		output[11][2] =(byte)0x3e;
		output[11][3] =(byte)0x4b;
		output[11][4] =(byte)0xc6;
		output[11][5] =(byte)0xd2;
		output[11][6] =(byte)0x79;
		output[11][7] =(byte)0x20;
		output[11][8] =(byte)0x9a;
		output[11][9] =(byte)0xdb;
		output[11][10] =(byte)0xc0;
		output[11][11] =(byte)0xfe;
		output[11][12] =(byte)0x78;
		output[11][13] =(byte)0xcd;
		output[11][14] =(byte)0x5a;
		output[11][15] =(byte)0xf4;
		output[12][0] =(byte)0x1f;
		output[12][1] =(byte)0xdd;
		output[12][2] =(byte)0xa8;
		output[12][3] =(byte)0x33;
		output[12][4] =(byte)0x88;
		output[12][5] =(byte)0x07;
		output[12][6] =(byte)0xc7;
		output[12][7] =(byte)0x31;
		output[12][8] =(byte)0xb1;
		output[12][9] =(byte)0x12;
		output[12][10] =(byte)0x10;
		output[12][11] =(byte)0x59;
		output[12][12] =(byte)0x27;
		output[12][13] =(byte)0x80;
		output[12][14] =(byte)0xec;
		output[12][15] =(byte)0x5f;
		output[13][0] =(byte)0x60;
		output[13][1] =(byte)0x51;
		output[13][2] =(byte)0x7f;
		output[13][3] =(byte)0xa9;
		output[13][4] =(byte)0x19;
		output[13][5] =(byte)0xb5;
		output[13][6] =(byte)0x4a;
		output[13][7] =(byte)0x0d;
		output[13][8] =(byte)0x2d;
		output[13][9] =(byte)0xe5;
		output[13][10] =(byte)0x7a;
		output[13][11] =(byte)0x9f;
		output[13][12] =(byte)0x93;
		output[13][13] =(byte)0xc9;
		output[13][14] =(byte)0x9c;
		output[13][15] =(byte)0xef;
		output[14][0] =(byte)0xa0;
		output[14][1] =(byte)0xe0;
		output[14][2] =(byte)0x3b;
		output[14][3] =(byte)0x4d;
		output[14][4] =(byte)0xae;
		output[14][5] =(byte)0x2a;
		output[14][6] =(byte)0xf5;
		output[14][7] =(byte)0xb0;
		output[14][8] =(byte)0xc8;
		output[14][9] =(byte)0xeb;
		output[14][10] =(byte)0xbb;
		output[14][11] =(byte)0x3c;
		output[14][12] =(byte)0x83;
		output[14][13] =(byte)0x53;
		output[14][14] =(byte)0x99;
		output[14][15] =(byte)0x61;
		output[15][0] =(byte)0x17;
		output[15][1] =(byte)0x2b;
		output[15][2] =(byte)0x04;
		output[15][3] =(byte)0x7e;
		output[15][4] =(byte)0xba;
		output[15][5] =(byte)0x77;
		output[15][6] =(byte)0xd6;
		output[15][7] =(byte)0x26;
		output[15][8] =(byte)0xe1;
		output[15][9] =(byte)0x69;
		output[15][10] =(byte)0x14;
		output[15][11] =(byte)0x63;
		output[15][12] =(byte)0x55;
		output[15][13] =(byte)0x21;
		output[15][14] =(byte)0x0c;
		output[15][15] =(byte)0x7d;
		return output;
	}
}