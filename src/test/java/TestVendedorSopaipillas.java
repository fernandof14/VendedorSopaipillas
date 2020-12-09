import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestVendedorSopaipillas {

    static VendedorSopaipillas vendedorTest;
    @BeforeClass

    public static void beforeClas() {
        vendedorTest=new VendedorSopaipillas();
    }

    @Test
    public void vuelto() {
        int ans;
        ans=vendedorTest.vuelto(200);
        int esperado=-1;
        assertEquals(esperado,ans);

    }



}