package hockey.hockeygame;

/**
 * Created by user on 18/03/2017.
 */

public enum Player {
    CROSBY(99, 94, 90, 84, 90, 85),
    OVECHKIN(98, 95, 99, 40, 95, 95),
    WEBER(97, 80, 95, 95, 99, 70),
    STAMKOS(96, 90, 97, 60, 65, 95),
    BENN(95, 85, 90, 76, 96, 87),
    HENRIK(94, 86, 78, 70, 86, 54),
    KANE(93, 99, 90, 30, 20, 99),
    DOUGHTY(92, 70, 87, 90, 86, 84),
    KOPITAR(91, 80, 89, 95, 84, 82),
    TARASENKO(90, 97, 85, 59, 65, 90),
    KEITH(89, 70, 78, 90, 76, 88),
    HORVAT(88, 70, 79, 83, 87, 90),
    TAVARES(87, 90, 85, 76, 69, 69),
    MALKIN(86, 84, 76, 84, 90, 88),
    SUTER(85, 80, 68, 98, 89, 68),
    KARLSSON(84, 90, 81, 87, 71, 89),
    BURNS(83, 85, 89, 80, 78, 80),
    HEDMAN(82, 76, 78, 84, 84, 73),
    SEGUIN(81, 87, 74, 73, 62, 78),
    MCDAVID(80, 88, 76, 67, 54, 99),
    PAVELSKI(79, 70, 76, 60, 40, 78),
    GETZLAF(78, 74, 65, 55, 70, 65),
    BURE(77, 90, 90, 35, 40, 99),
    BACKSTROM(76, 83, 65, 55, 60, 87),
    VLASIC(75, 49, 55, 87, 58, 50),
    SUBBAN(74, 69, 70, 79, 70, 64),
    PERRY(73, 85, 89, 48, 67, 70),
    GIROUX(72, 83, 76, 43, 50, 76),
    BYFUGLIEN(71, 68, 68, 67, 99, 53),
    HALL(70, 85, 92, 13, 39, 92),
    GAUDREAU(69, 98, 86, 7, 1, 90),
    BERGERON(68, 84, 55, 90, 60, 70),
    GIORDANO(67, 75, 62, 66, 73, 52),
    SHATTENKIRK(66, 68, 57, 89, 70, 62),
    TOEWS(65, 64, 55, 87, 74, 64),
    JOSI(64, 55, 46, 78, 68, 51),
    THORNTON(63, 71, 33, 48, 65, 60),
    LETANG(62, 70, 29, 78, 75, 64),
    PIETRANGELO(61, 64, 37, 67, 80, 59),
    SEABROOK(60, 56, 7, 84, 82, 47),
    MCDONAGH(59, 55, 9, 87, 73, 64),
    VORACEK(58, 60, 19, 54, 45, 68),
    PACIORETTY(57, 49, 53, 48, 32, 81),
    KUZNETSOV(56, 80, 76, 23, 21, 88),
    TANEV(55, 70, 4, 99, 58, 66),
    JAGR(54, 69, 67, 35, 89, 65),
    DATSYUK(53, 99, 54, 90, 35, 65),
    KOVALCHUK(52, 70, 86, 31, 62, 80),
    DRAISAITL(51, 50, 67, 30, 71, 74),
    CHARA(50, 60, 99, 68, 97, 55),
    DANIEL(49, 55, 67, 23, 82, 55),
    KESLER(48, 70, 44, 89, 68, 87),
    LAINE(47, 69, 90, 17, 36, 90),
    LARSSON(46, 55, 19, 79, 80, 54),
    ERICSSON(45, 40, 65, 37, 45, 80),
    ATKINSSON(44, 44, 65, 23, 55, 76),
    TRYAMKIN(43, 65, 39, 67, 99, 50),
    SCHLIEFE(42, 60, 37, 49, 54, 70),
    KESSEL(41, 55, 20, 17, 32, 91),
    MATTHEWS(40, 45, 39, 58, 65, 70),
    PANANNIN(39, 70, 66, 21, 37, 76),
    CARTER(38, 59, 80, 18, 45, 67),
    EHLERS(37, 87, 67, 21, 23, 84),
    NYLANDER(36, 78, 64, 6, 23, 70),
    ZETTERBERG(35, 70, 45, 38, 49, 67),
    STAAL(34, 55, 37, 70, 67, 45),
    WHEELER(33, 44, 29, 37, 34, 76),
    GRABNER(32, 30, 38, 5, 15, 98),
    GRANLUND(31, 40, 36, 10, 34, 61),
    WENNBERG(30, 30, 29, 30, 34, 54),
    DOAN(29, 43, 44, 27, 70, 25),
    MARNER(28, 44, 37, 15, 21, 66),
    FOLIGNO(27, 34, 26, 13, 45, 34),
    HAMHUIS(26, 60, 8, 86, 68, 43),
    EKBERG(25, 47, 10, 70, 55, 36),
    MAATA(24, 43, 27, 67, 39, 69),
    STEPAN(23, 38, 36, 10, 52, 60),
    COYLE(22, 20, 10, 12, 45, 29),
    RADULOV(21, 80, 67, 7, 18, 70),
    DAVISON(20, 49, 20, 10, 87, 28),
    TKACHUCK(19, 70, 70, 8, 68, 45),
    SHAW(18, 49, 18, 20, 39, 38),
    IGILNA(17, 52, 29, 18, 83, 12),
    KADRI(16, 30, 18, 44, 45, 58),
    SIMMONDS(15, 23, 29, 12, 67, 56),
    MAROON(14, 34, 17, 15, 34, 70),
    NEIL(13, 9, 7, 17, 89, 45),
    OTT(12, 6, 1, 13, 79, 30),
    KASSIAN(11, 12, 9, 10, 87, 32),
    LUCIC(10, 9, 14, 9, 94, 32),
    CLIFFORD(9, 8, 1, 7, 94, 8),
    ENGELLEND(8, 4, 2, 6, 87, 45),
    WATSON(7, 2, 1, 10, 81, 8),
    HAYLEY(6, 3, 1, 9, 79, 2),
    MARTIN(5, 5, 1, 8, 80, 4),
    THORBURN(4, 2, 1, 7, 67, 12),
    BOLL(3, 3, 2, 9, 94, 3),
    JONES(2, 1, 3, 2, 90, 2),
    GLASS(1, 1, 1, 50, 50, 3);

    public int value;
    public int stickhandling;
    public int shot;
    public int checking;
    public int strength;
    public int skating;

    Player(int value, int stickhandling, int shot, int checking, int strength, int skating) {
        this.value = value;
        this.stickhandling = stickhandling;
        this.shot = shot;
        this.checking = checking;
        this.strength = strength;
        this.skating = skating;
    }

}
