public class MvpVotes {
    public static void main(String[] args) {

        int first = 10;
        int second = 7;
        int third = 3;
        int[] playerTotals = new int[100];
        int biggest=0;

        int[][] mvpVotes = new int[3][100];
        mvpVotes[0][0] = 9903;//1 place votes for player 0
        mvpVotes[0][1] = 17028;//1 place votes for player 1
        mvpVotes[0][2] = 6671;//1 place votes for player 2
        mvpVotes[0][3] = 2802;//1 place votes for player 3
        mvpVotes[0][4] = 5194;//1 place votes for player 4
        mvpVotes[0][5] = 9764;//1 place votes for player 5
        mvpVotes[0][6] = 9144;//1 place votes for player 6
        mvpVotes[0][7] = 4443;//1 place votes for player 7
        mvpVotes[0][8] = 5359;//1 place votes for player 8
        mvpVotes[0][9] = 1233;//1 place votes for player 9
        mvpVotes[0][10] = 2268;//1 place votes for player 10
        mvpVotes[0][11] = 3245;//1 place votes for player 11
        mvpVotes[0][12] = 1546;//1 place votes for player 12
        mvpVotes[0][13] = 3018;//1 place votes for player 13
        mvpVotes[0][14] = 282;//1 place votes for player 14
        mvpVotes[0][15] = 3039;//1 place votes for player 15
        mvpVotes[0][16] = 2802;//1 place votes for player 16
        mvpVotes[0][17] = 1834;//1 place votes for player 17
        mvpVotes[0][18] = 1885;//1 place votes for player 18
        mvpVotes[0][19] = 185;//1 place votes for player 19
        mvpVotes[0][20] = 1249;//1 place votes for player 20
        mvpVotes[0][21] = 637;//1 place votes for player 21
        mvpVotes[0][22] = 17;//1 place votes for player 22
        mvpVotes[0][23] = 812;//1 place votes for player 23
        mvpVotes[0][24] = 99;//1 place votes for player 24
        mvpVotes[0][25] = 49;//1 place votes for player 25
        mvpVotes[0][26] = 468;//1 place votes for player 26
        mvpVotes[0][27] = 445;//1 place votes for player 27
        mvpVotes[0][28] = 769;//1 place votes for player 28
        mvpVotes[0][29] = 613;//1 place votes for player 29
        mvpVotes[0][30] = 459;//1 place votes for player 30
        mvpVotes[0][31] = 73;//1 place votes for player 31
        mvpVotes[0][32] = 276;//1 place votes for player 32
        mvpVotes[0][33] = 222;//1 place votes for player 33
        mvpVotes[0][34] = 15;//1 place votes for player 34
        mvpVotes[0][35] = 135;//1 place votes for player 35
        mvpVotes[0][36] = 263;//1 place votes for player 36
        mvpVotes[0][37] = 149;//1 place votes for player 37
        mvpVotes[0][38] = 212;//1 place votes for player 38
        mvpVotes[0][39] = 10;//1 place votes for player 39
        mvpVotes[0][40] = 50;//1 place votes for player 40
        mvpVotes[0][41] = 45;//1 place votes for player 41
        mvpVotes[0][42] = 113;//1 place votes for player 42
        mvpVotes[0][43] = 80;//1 place votes for player 43
        mvpVotes[0][44] = 27;//1 place votes for player 44
        mvpVotes[0][45] = 113;//1 place votes for player 45
        mvpVotes[0][46] = 142;//1 place votes for player 46
        mvpVotes[0][47] = 135;//1 place votes for player 47
        mvpVotes[0][48] = 35;//1 place votes for player 48
        mvpVotes[0][49] = 95;//1 place votes for player 49
        mvpVotes[0][50] = 43;//1 place votes for player 50
        mvpVotes[0][51] = 23;//1 place votes for player 51
        mvpVotes[0][52] = 58;//1 place votes for player 52
        mvpVotes[0][53] = 42;//1 place votes for player 53
        mvpVotes[0][54] = 60;//1 place votes for player 54
        mvpVotes[0][55] = 38;//1 place votes for player 55
        mvpVotes[0][56] = 36;//1 place votes for player 56
        mvpVotes[0][57] = 27;//1 place votes for player 57
        mvpVotes[0][58] = 40;//1 place votes for player 58
        mvpVotes[0][59] = 6;//1 place votes for player 59
        mvpVotes[0][60] = 29;//1 place votes for player 60
        mvpVotes[0][61] = 18;//1 place votes for player 61
        mvpVotes[0][62] = 3;//1 place votes for player 62
        mvpVotes[0][63] = 8;//1 place votes for player 63
        mvpVotes[0][64] = 10;//1 place votes for player 64
        mvpVotes[0][65] = 3;//1 place votes for player 65
        mvpVotes[0][66] = 17;//1 place votes for player 66
        mvpVotes[0][67] = 12;//1 place votes for player 67
        mvpVotes[0][68] = 7;//1 place votes for player 68
        mvpVotes[0][69] = 3;//1 place votes for player 69
        mvpVotes[0][70] = 0;//1 place votes for player 70
        mvpVotes[0][71] = 3;//1 place votes for player 71
        mvpVotes[0][72] = 9;//1 place votes for player 72
        mvpVotes[0][73] = 1;//1 place votes for player 73
        mvpVotes[0][74] = 1;//1 place votes for player 74
        mvpVotes[0][75] = 8;//1 place votes for player 75
        mvpVotes[0][76] = 7;//1 place votes for player 76
        mvpVotes[0][77] = 6;//1 place votes for player 77
        mvpVotes[0][78] = 0;//1 place votes for player 78
        mvpVotes[0][79] = 0;//1 place votes for player 79
        mvpVotes[0][80] = 3;//1 place votes for player 80
        mvpVotes[0][81] = 1;//1 place votes for player 81
        mvpVotes[0][82] = 4;//1 place votes for player 82
        mvpVotes[0][83] = 3;//1 place votes for player 83
        mvpVotes[0][84] = 2;//1 place votes for player 84
        mvpVotes[0][85] = 2;//1 place votes for player 85
        mvpVotes[0][86] = 1;//1 place votes for player 86
        mvpVotes[0][87] = 1;//1 place votes for player 87
        mvpVotes[0][88] = 0;//1 place votes for player 88
        mvpVotes[0][89] = 1;//1 place votes for player 89
        mvpVotes[0][90] = 0;//1 place votes for player 90
        mvpVotes[0][91] = 0;//1 place votes for player 91
        mvpVotes[0][92] = 1;//1 place votes for player 92
        mvpVotes[0][93] = 0;//1 place votes for player 93
        mvpVotes[0][94] = 0;//1 place votes for player 94
        mvpVotes[0][95] = 0;//1 place votes for player 95
        mvpVotes[0][96] = 0;//1 place votes for player 96
        mvpVotes[0][97] = 0;//1 place votes for player 97
        mvpVotes[0][98] = 0;//1 place votes for player 98
        mvpVotes[0][99] = 11;//1 place votes for player 99
        mvpVotes[1][0] = 3687;//2 place votes for player 0
        mvpVotes[1][1] = 8925;//2 place votes for player 1
        mvpVotes[1][2] = 10806;//2 place votes for player 2
        mvpVotes[1][3] = 14341;//2 place votes for player 3
        mvpVotes[1][4] = 2293;//2 place votes for player 4
        mvpVotes[1][5] = 431;//2 place votes for player 5
        mvpVotes[1][6] = 724;//2 place votes for player 6
        mvpVotes[1][7] = 10632;//2 place votes for player 7
        mvpVotes[1][8] = 6018;//2 place votes for player 8
        mvpVotes[1][9] = 1877;//2 place votes for player 9
        mvpVotes[1][10] = 4017;//2 place votes for player 10
        mvpVotes[1][11] = 2741;//2 place votes for player 11
        mvpVotes[1][12] = 339;//2 place votes for player 12
        mvpVotes[1][13] = 27;//2 place votes for player 13
        mvpVotes[1][14] = 2696;//2 place votes for player 14
        mvpVotes[1][15] = 4645;//2 place votes for player 15
        mvpVotes[1][16] = 869;//2 place votes for player 16
        mvpVotes[1][17] = 1812;//2 place votes for player 17
        mvpVotes[1][18] = 1089;//2 place votes for player 18
        mvpVotes[1][19] = 1553;//2 place votes for player 19
        mvpVotes[1][20] = 2774;//2 place votes for player 20
        mvpVotes[1][21] = 2591;//2 place votes for player 21
        mvpVotes[1][22] = 2750;//2 place votes for player 22
        mvpVotes[1][23] = 992;//2 place votes for player 23
        mvpVotes[1][24] = 1316;//2 place votes for player 24
        mvpVotes[1][25] = 846;//2 place votes for player 25
        mvpVotes[1][26] = 412;//2 place votes for player 26
        mvpVotes[1][27] = 194;//2 place votes for player 27
        mvpVotes[1][28] = 1477;//2 place votes for player 28
        mvpVotes[1][29] = 990;//2 place votes for player 29
        mvpVotes[1][30] = 25;//2 place votes for player 30
        mvpVotes[1][31] = 91;//2 place votes for player 31
        mvpVotes[1][32] = 299;//2 place votes for player 32
        mvpVotes[1][33] = 73;//2 place votes for player 33
        mvpVotes[1][34] = 714;//2 place votes for player 34
        mvpVotes[1][35] = 48;//2 place votes for player 35
        mvpVotes[1][36] = 367;//2 place votes for player 36
        mvpVotes[1][37] = 284;//2 place votes for player 37
        mvpVotes[1][38] = 771;//2 place votes for player 38
        mvpVotes[1][39] = 497;//2 place votes for player 39
        mvpVotes[1][40] = 576;//2 place votes for player 40
        mvpVotes[1][41] = 364;//2 place votes for player 41
        mvpVotes[1][42] = 126;//2 place votes for player 42
        mvpVotes[1][43] = 205;//2 place votes for player 43
        mvpVotes[1][44] = 333;//2 place votes for player 44
        mvpVotes[1][45] = 69;//2 place votes for player 45
        mvpVotes[1][46] = 243;//2 place votes for player 46
        mvpVotes[1][47] = 130;//2 place votes for player 47
        mvpVotes[1][48] = 64;//2 place votes for player 48
        mvpVotes[1][49] = 77;//2 place votes for player 49
        mvpVotes[1][50] = 27;//2 place votes for player 50
        mvpVotes[1][51] = 146;//2 place votes for player 51
        mvpVotes[1][52] = 117;//2 place votes for player 52
        mvpVotes[1][53] = 97;//2 place votes for player 53
        mvpVotes[1][54] = 28;//2 place votes for player 54
        mvpVotes[1][55] = 44;//2 place votes for player 55
        mvpVotes[1][56] = 51;//2 place votes for player 56
        mvpVotes[1][57] = 18;//2 place votes for player 57
        mvpVotes[1][58] = 30;//2 place votes for player 58
        mvpVotes[1][59] = 7;//2 place votes for player 59
        mvpVotes[1][60] = 18;//2 place votes for player 60
        mvpVotes[1][61] = 37;//2 place votes for player 61
        mvpVotes[1][62] = 27;//2 place votes for player 62
        mvpVotes[1][63] = 2;//2 place votes for player 63
        mvpVotes[1][64] = 10;//2 place votes for player 64
        mvpVotes[1][65] = 5;//2 place votes for player 65
        mvpVotes[1][66] = 14;//2 place votes for player 66
        mvpVotes[1][67] = 12;//2 place votes for player 67
        mvpVotes[1][68] = 9;//2 place votes for player 68
        mvpVotes[1][69] = 11;//2 place votes for player 69
        mvpVotes[1][70] = 11;//2 place votes for player 70
        mvpVotes[1][71] = 4;//2 place votes for player 71
        mvpVotes[1][72] = 10;//2 place votes for player 72
        mvpVotes[1][73] = 8;//2 place votes for player 73
        mvpVotes[1][74] = 0;//2 place votes for player 74
        mvpVotes[1][75] = 2;//2 place votes for player 75
        mvpVotes[1][76] = 3;//2 place votes for player 76
        mvpVotes[1][77] = 5;//2 place votes for player 77
        mvpVotes[1][78] = 4;//2 place votes for player 78
        mvpVotes[1][79] = 2;//2 place votes for player 79
        mvpVotes[1][80] = 1;//2 place votes for player 80
        mvpVotes[1][81] = 3;//2 place votes for player 81
        mvpVotes[1][82] = 0;//2 place votes for player 82
        mvpVotes[1][83] = 0;//2 place votes for player 83
        mvpVotes[1][84] = 2;//2 place votes for player 84
        mvpVotes[1][85] = 2;//2 place votes for player 85
        mvpVotes[1][86] = 0;//2 place votes for player 86
        mvpVotes[1][87] = 0;//2 place votes for player 87
        mvpVotes[1][88] = 1;//2 place votes for player 88
        mvpVotes[1][89] = 1;//2 place votes for player 89
        mvpVotes[1][90] = 0;//2 place votes for player 90
        mvpVotes[1][91] = 0;//2 place votes for player 91
        mvpVotes[1][92] = 0;//2 place votes for player 92
        mvpVotes[1][93] = 1;//2 place votes for player 93
        mvpVotes[1][94] = 0;//2 place votes for player 94
        mvpVotes[1][95] = 0;//2 place votes for player 95
        mvpVotes[1][96] = 1;//2 place votes for player 96
        mvpVotes[1][97] = 0;//2 place votes for player 97
        mvpVotes[1][98] = 0;//2 place votes for player 98
        mvpVotes[1][99] = 9;//2 place votes for player 99
        mvpVotes[2][0] = 7512;//3 place votes for player 0
        mvpVotes[2][1] = 3265;//3 place votes for player 1
        mvpVotes[2][2] = 3831;//3 place votes for player 2
        mvpVotes[2][3] = 3346;//3 place votes for player 3
        mvpVotes[2][4] = 2218;//3 place votes for player 4
        mvpVotes[2][5] = 7757;//3 place votes for player 5
        mvpVotes[2][6] = 11385;//3 place votes for player 6
        mvpVotes[2][7] = 9369;//3 place votes for player 7
        mvpVotes[2][8] = 8183;//3 place votes for player 8
        mvpVotes[2][9] = 6957;//3 place votes for player 9
        mvpVotes[2][10] = 4558;//3 place votes for player 10
        mvpVotes[2][11] = 3286;//3 place votes for player 11
        mvpVotes[2][12] = 2544;//3 place votes for player 12
        mvpVotes[2][13] = 3053;//3 place votes for player 13
        mvpVotes[2][14] = 7;//3 place votes for player 14
        mvpVotes[2][15] = 78;//3 place votes for player 15
        mvpVotes[2][16] = 3956;//3 place votes for player 16
        mvpVotes[2][17] = 2324;//3 place votes for player 17
        mvpVotes[2][18] = 153;//3 place votes for player 18
        mvpVotes[2][19] = 2950;//3 place votes for player 19
        mvpVotes[2][20] = 1542;//3 place votes for player 20
        mvpVotes[2][21] = 757;//3 place votes for player 21
        mvpVotes[2][22] = 1854;//3 place votes for player 22
        mvpVotes[2][23] = 1486;//3 place votes for player 23
        mvpVotes[2][24] = 932;//3 place votes for player 24
        mvpVotes[2][25] = 1221;//3 place votes for player 25
        mvpVotes[2][26] = 287;//3 place votes for player 26
        mvpVotes[2][27] = 456;//3 place votes for player 27
        mvpVotes[2][28] = 662;//3 place votes for player 28
        mvpVotes[2][29] = 210;//3 place votes for player 29
        mvpVotes[2][30] = 249;//3 place votes for player 30
        mvpVotes[2][31] = 338;//3 place votes for player 31
        mvpVotes[2][32] = 510;//3 place votes for player 32
        mvpVotes[2][33] = 42;//3 place votes for player 33
        mvpVotes[2][34] = 261;//3 place votes for player 34
        mvpVotes[2][35] = 186;//3 place votes for player 35
        mvpVotes[2][36] = 397;//3 place votes for player 36
        mvpVotes[2][37] = 296;//3 place votes for player 37
        mvpVotes[2][38] = 0;//3 place votes for player 38
        mvpVotes[2][39] = 145;//3 place votes for player 39
        mvpVotes[2][40] = 109;//3 place votes for player 40
        mvpVotes[2][41] = 36;//3 place votes for player 41
        mvpVotes[2][42] = 234;//3 place votes for player 42
        mvpVotes[2][43] = 198;//3 place votes for player 43
        mvpVotes[2][44] = 72;//3 place votes for player 44
        mvpVotes[2][45] = 65;//3 place votes for player 45
        mvpVotes[2][46] = 50;//3 place votes for player 46
        mvpVotes[2][47] = 45;//3 place votes for player 47
        mvpVotes[2][48] = 47;//3 place votes for player 48
        mvpVotes[2][49] = 9;//3 place votes for player 49
        mvpVotes[2][50] = 112;//3 place votes for player 50
        mvpVotes[2][51] = 78;//3 place votes for player 51
        mvpVotes[2][52] = 3;//3 place votes for player 52
        mvpVotes[2][53] = 15;//3 place votes for player 53
        mvpVotes[2][54] = 2;//3 place votes for player 54
        mvpVotes[2][55] = 57;//3 place votes for player 55
        mvpVotes[2][56] = 48;//3 place votes for player 56
        mvpVotes[2][57] = 15;//3 place votes for player 57
        mvpVotes[2][58] = 44;//3 place votes for player 58
        mvpVotes[2][59] = 1;//3 place votes for player 59
        mvpVotes[2][60] = 37;//3 place votes for player 60
        mvpVotes[2][61] = 26;//3 place votes for player 61
        mvpVotes[2][62] = 24;//3 place votes for player 62
        mvpVotes[2][63] = 8;//3 place votes for player 63
        mvpVotes[2][64] = 9;//3 place votes for player 64
        mvpVotes[2][65] = 11;//3 place votes for player 65
        mvpVotes[2][66] = 6;//3 place votes for player 66
        mvpVotes[2][67] = 0;//3 place votes for player 67
        mvpVotes[2][68] = 8;//3 place votes for player 68
        mvpVotes[2][69] = 10;//3 place votes for player 69
        mvpVotes[2][70] = 8;//3 place votes for player 70
        mvpVotes[2][71] = 4;//3 place votes for player 71
        mvpVotes[2][72] = 2;//3 place votes for player 72
        mvpVotes[2][73] = 6;//3 place votes for player 73
        mvpVotes[2][74] = 4;//3 place votes for player 74
        mvpVotes[2][75] = 4;//3 place votes for player 75
        mvpVotes[2][76] = 5;//3 place votes for player 76
        mvpVotes[2][77] = 3;//3 place votes for player 77
        mvpVotes[2][78] = 0;//3 place votes for player 78
        mvpVotes[2][79] = 2;//3 place votes for player 79
        mvpVotes[2][80] = 0;//3 place votes for player 80
        mvpVotes[2][81] = 3;//3 place votes for player 81
        mvpVotes[2][82] = 1;//3 place votes for player 82
        mvpVotes[2][83] = 1;//3 place votes for player 83
        mvpVotes[2][84] = 1;//3 place votes for player 84
        mvpVotes[2][85] = 1;//3 place votes for player 85
        mvpVotes[2][86] = 1;//3 place votes for player 86
        mvpVotes[2][87] = 0;//3 place votes for player 87
        mvpVotes[2][88] = 1;//3 place votes for player 88
        mvpVotes[2][89] = 0;//3 place votes for player 89
        mvpVotes[2][90] = 0;//3 place votes for player 90
        mvpVotes[2][91] = 0;//3 place votes for player 91
        mvpVotes[2][92] = 0;//3 place votes for player 92
        mvpVotes[2][93] = 1;//3 place votes for player 93
        mvpVotes[2][94] = 1;//3 place votes for player 94
        mvpVotes[2][95] = 0;//3 place votes for player 95
        mvpVotes[2][96] = 0;//3 place votes for player 96
        mvpVotes[2][97] = 0;//3 place votes for player 97
        mvpVotes[2][98] = 0;//3 place votes for player 98
        mvpVotes[2][99] = 9;//3 place votes for player 99

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < mvpVotes[i].length; j++) {
                playerTotals[j] += mvpVotes[i][j] * first;

                for (int l = 1; l < 2; l++) {
                    for (int m = 0; m < mvpVotes[l].length; m++) {
                        playerTotals[m] += mvpVotes[l][m] * second;

                        for (int g = 2; g < 3; g++) {
                            for (int h = 0; h < mvpVotes[g].length; h++) {
                                playerTotals[h] += mvpVotes[g][h] * third;

                            }
                        }

                    }


                }
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < mvpVotes[i].length; j++) {
                System.out.println("player " + (j + 1) + "has " + playerTotals[j] + " points");


            }
        }
    }
}