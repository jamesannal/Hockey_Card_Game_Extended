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
    HENRIK(94, 86, 78, 70, 86, 87),
    KANE(93, 99, 90, 60, 20, 99),
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
//    PAVELSKI(79),
//    GETZLAF(78),
//    BURE(77),
//    BACKSTROM(76),
//    VLASIC(75),
//    SUBBAN(74),
//    PERRY(73),
//    GIROUX(72),
//    BYFUGLIEN(71),
//    HALL(70),
//    GAUDREAU(69),
//    BERGERON(68),
//    GIORDANO(67),
//    SHATTENKIRK(66),
//    TOEWS(65),
//    JOSI(64),
//    THORNTON(63),
//    LETANG(62),
//    PIETRANGELO(61),
//    SEABROOK(60),
//    MCDONAGH(59),
//    VORACEK(58),
//    PACIORETTY(57),
//    KUZNETSOV(56),
//    TANEV(55),
//    JAGR(54),
//    DATSYUK(53),
//    KOVALCHUK(52),
//    DRAISAITL(51),
//    CHARA(50),
//    DANIEL(49),
//    KESLER(48),
//    LAINE(47),
//    LARSSON(46),
//    ERICSSON(45),
//    ATKINSSON(44),
//    TRYAMKIN(43),
//    SCHLIEFE(42),
//    KESSEL(41),
//    MATTHEWS(40),
//    PANANNIN(39),
//    CARTER(38),
//    EHLERS(37),
//    NYLANDER(36),
//    ZETTERBERG(35),
//    STAAL(34),
//    WHEELER(33),
//    GRABNER(32),
//    GRANLUND(31),
//    WENNBERG(30),
//    DOAN(29),
//    MARNER(28),
//    FOLIGNO(27),
//    HAMHUIS(26),
//    EKBERG(25),
//    MAATA(24),
//    STEPAN(23),
//    COYLE(22),
//    RADULOV(21),
//    DAVISON(20),
//    TKACHUCK(19),
//    SHAW(18),
//    IGILNA(17),
//    KADRI(16),
//    SIMMONDS(15),
//    MAROON(14),
//    NEIL(13),
//    OTT(12),
//    KASSIAN(11),
//    LUCIC(10),
//    CLIFFORD(9),
//    ENGELLEND(8),
//    WATSON(7),
//    HAYLEY(6),
//    MARTIN(5),
//    THORBURN(4),
//    BOLL(3),
//    MCLEOD(2),
    GLASS(1, 1, 2, 80, 70, 3);

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
