package com.fecripve.core.coins;


import com.fecripve.core.coins.families.BitFamily;

/**
 * Created by jestevez
 */
public class BolivarcoinMain extends BitFamily {
    private static BolivarcoinMain instance = new BolivarcoinMain();

    private BolivarcoinMain() {
        this.id = "bolivarcoin.main";

        this.addressHeader = 85;
        this.p2shHeader = 5;
        this.acceptableAddressCodes = new int[]{this.addressHeader, this.p2shHeader};
        this.spendableCoinbaseDepth = 100;
        this.dumpedPrivateKeyHeader = 128 + addressHeader;
        this.name = "Bolivarcoin";
        this.symbol = "BOLI";
        this.uriScheme = "bolivarcoin";
        this.bip44Index = 278;
        this.unitExponent = 8;

        this.feeValue = value(10000);
        this.minNonDust = value(1);
        this.softDustLimit = value(1000000);
        this.softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        this.signedMessageHeader = CoinType.toBytes("Bolivarcoin Signed Message:\n");
    }

    public static synchronized BolivarcoinMain get() {
        BolivarcoinMain bolivarcoinMain;
        synchronized (BolivarcoinMain.class) {
            bolivarcoinMain = instance;
        }
        return bolivarcoinMain;
    }

}