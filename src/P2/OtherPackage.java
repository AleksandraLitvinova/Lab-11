package P2;

class OtherPackage {
    OtherPackage() {
        P1.Protection p = new P1.Protection();
        System.out.println("�o�c�py��op �� ������� ������");
    // �������� ������ ��� ������� ������ ��� ������
    // System.out . println ( "n = " + p.n) ;
    // �������� ������ ��� ������� ������
    // Sys tem. out . println ( "n_pri = " + p.n_pri ) ;
    // �������� ������ ��� ������� ������, ��������� ��� ������
    // System.out . println ( "n_pro = "+ p.n_pro ) ;
        System.out.println("n_pub = " + p.n_pub);
    }
}
