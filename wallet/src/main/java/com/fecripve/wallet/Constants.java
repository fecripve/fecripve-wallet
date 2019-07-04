package com.fecripve.wallet;

import android.text.format.DateUtils;

import com.fecripve.core.coins.AndescoinMain;
import com.fecripve.core.coins.ArepacoinMain;
import com.fecripve.core.coins.BitcoinMain;
import com.fecripve.core.coins.BolivarcoinMain;
import com.fecripve.core.coins.CoinID;
import com.fecripve.core.coins.CoinType;
import com.fecripve.core.coins.LkrcoinMain;
import com.fecripve.core.coins.OnixcoinMain;
import com.fecripve.core.coins.RilcoinMain;
import com.fecripve.core.network.CoinAddress;
import com.fecripve.stratumj.ServerAddress;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author John L. Jegutanis
 * @author Andreas Schildbach
 */
public class Constants {

    public static final int SEED_ENTROPY_DEFAULT = 192;
    public static final int SEED_ENTROPY_EXTRA = 256;

    public static final String ARG_SEED = "seed";
    public static final String ARG_PASSWORD = "password";
    public static final String ARG_SEED_PASSWORD = "seed_password";
    public static final String ARG_EMPTY_WALLET = "empty_wallet";
    public static final String ARG_SEND_TO_ADDRESS = "send_to_address";
    public static final String ARG_SEND_TO_COIN_TYPE = "send_to_coin_type";
    public static final String ARG_SEND_TO_ACCOUNT_ID = "send_to_account_id";
    public static final String ARG_SEND_VALUE = "send_value";
    public static final String ARG_TX_MESSAGE = "tx_message";
    public static final String ARG_COIN_ID = "coin_id";
    public static final String ARG_ACCOUNT_ID = "account_id";
    public static final String ARG_MULTIPLE_COIN_IDS = "multiple_coin_ids";
    public static final String ARG_MULTIPLE_CHOICE = "multiple_choice";
    public static final String ARG_SEND_REQUEST = "send_request";
    public static final String ARG_TRANSACTION_ID = "transaction_id";
    public static final String ARG_ERROR = "error";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_ADDRESS = "address";
    public static final String ARG_ADDRESS_STRING = "address_string";
    public static final String ARG_EXCHANGE_ENTRY = "exchange_entry";
    public static final String ARG_URI = "test_wallet";
    public static final String ARG_PRIVATE_KEY = "private_key";

    public static final int PERMISSIONS_REQUEST_CAMERA = 0;

    public static final String WALLET_FILENAME_PROTOBUF = "wallet";
    public static final long WALLET_WRITE_DELAY = 5;
    public static final TimeUnit WALLET_WRITE_DELAY_UNIT = TimeUnit.SECONDS;

    public static final long STOP_SERVICE_AFTER_IDLE_SECS = 30 * 60; // 30 mins

    public static final String HTTP_CACHE_NAME = "http_cache";
    public static final int HTTP_CACHE_SIZE = 256 * 1024; // 256 KiB
    public static final int NETWORK_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

    public static final String TX_CACHE_NAME = "tx_cache";
    public static final int TX_CACHE_SIZE = 5 * 1024 * 1024; // 5 MiB, TODO currently not enforced

    public static final long RATE_UPDATE_FREQ_MS = 30 * DateUtils.SECOND_IN_MILLIS;

    /** Default currency to use if all default mechanisms fail. */
    public static final String DEFAULT_EXCHANGE_CURRENCY = "VES";

    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final Charset US_ASCII = Charset.forName("US-ASCII");

    public static final char CHAR_HAIR_SPACE = '\u200a';
    public static final char CHAR_THIN_SPACE = '\u2009';
    public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
    public static final char CHAR_CHECKMARK = '\u2713';
    public static final char CURRENCY_PLUS_SIGN = '+';
    public static final char CURRENCY_MINUS_SIGN = '-';

    public static final String MARKET_APP_URL = "market://details?id=%s";
    public static final String BINARY_URL = "https://github.com/AraguaneyBits/AraguaneyBits-MultiWallet/releases";

    public static final String VERSION_URL = "https://joseluisestevez.com/version-multiwallet";
    public static final String SUPPORT_EMAIL = "support@fecripve.com";



    // TODO move to resource files
    public static final List<CoinAddress> DEFAULT_COINS_SERVERS = ImmutableList.of(
            new CoinAddress(BitcoinMain.get(),      new ServerAddress("btc-cce-1.coinomi.net", 5001),
                    new ServerAddress("btc-cce-2.coinomi.net", 5001)),
            new CoinAddress(OnixcoinMain.get(),
                    new ServerAddress("159.203.80.31", 23000),
                    new ServerAddress("159.203.80.31", 23001),
                    new ServerAddress("node.onixcoin.info", 50001),
                    new ServerAddress("node.onixcoin.info", 50002)
            ),
            new CoinAddress(LkrcoinMain.get(),
                    new ServerAddress("94.156.35.152", 30001),
                    new ServerAddress("94.156.35.152", 30002),
                    new ServerAddress("lkr.araguaneybits.com", 30001),
                    new ServerAddress("lkr.araguaneybits.com", 30002)
            ),
            new CoinAddress(ArepacoinMain.get(),
                    new ServerAddress("electrum.arepacripto.org", 50001),
                    new ServerAddress("electrum1.arepacripto.org", 50001),
                    new ServerAddress("arepa.araguaneybits.com", 60001),
                    new ServerAddress("arepa.araguaneybits.com", 60002)
            ),
            new CoinAddress(BolivarcoinMain.get(),
                    new ServerAddress("138.197.127.246", 23001),
                    new ServerAddress("electrum1.bolicoin.com", 23001),
                    new ServerAddress("electrum2.bolicoin.com", 23001),
                    new ServerAddress("boli.araguaneybits.com", 40001),
                    new ServerAddress("boli.araguaneybits.com", 40002)
            ),
            new CoinAddress(RilcoinMain.get(),
                    new ServerAddress("192.187.97.76", 23001),
                    new ServerAddress("192.187.97.76", 50001),
                    new ServerAddress("ril.araguaneybits.com", 31001),
                    new ServerAddress("ril.araguaneybits.com", 31002)
            ),
            new CoinAddress(AndescoinMain.get(),
                    new ServerAddress("andes.araguaneybits.com", 32001),
                    new ServerAddress("andes.araguaneybits.com", 32002)
            )

    );

    public static final HashMap<CoinType, Integer> COINS_ICONS;
    public static final HashMap<CoinType, String> COINS_BLOCK_EXPLORERS;
    static {
        COINS_ICONS = new HashMap<>();
        COINS_ICONS.put(CoinID.BITCOIN_MAIN.getCoinType(), R.drawable.bitcoin);
        COINS_ICONS.put(CoinID.ONIXCOIN_MAIN.getCoinType(), R.drawable.onixcoin);
        COINS_ICONS.put(CoinID.LKRCOIN_MAIN.getCoinType(), R.drawable.lkrcoin);
        COINS_ICONS.put(CoinID.AREPACOIN_MAIN.getCoinType(), R.drawable.arepacoin);
        COINS_ICONS.put(CoinID.BOLIVARCOIN_MAIN.getCoinType(), R.drawable.bolivarcoin);
        COINS_ICONS.put(CoinID.RILCOIN_MAIN.getCoinType(), R.drawable.rilcoin);
        COINS_ICONS.put(CoinID.ANDESCOIN_MAIN.getCoinType(), R.drawable.andescoin);

        COINS_BLOCK_EXPLORERS = new HashMap<>();
        COINS_BLOCK_EXPLORERS.put(CoinID.BITCOIN_MAIN.getCoinType(), "https://blockchain.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.ONIXCOIN_MAIN.getCoinType(), "https://onixcoin.info/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.LKRCOIN_MAIN.getCoinType(), "http://explorer.lkrcoin.io/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.AREPACOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/arepa/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.BOLIVARCOIN_MAIN.getCoinType(), "https://chainz.cryptoid.info/boli/tx.dws?%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.RILCOIN_MAIN.getCoinType(), "http://explorador.rilcoincrypto.org:3001/tx/%s");
        COINS_BLOCK_EXPLORERS.put(CoinID.ANDESCOIN_MAIN.getCoinType(), "http://explo.andes-coin.com/tx/%s");


    }

    public static final CoinType DEFAULT_COIN = BitcoinMain.get();
    public static final List<CoinType> DEFAULT_COINS = ImmutableList.of((CoinType) BitcoinMain.get());
    public static final ArrayList<String> DEFAULT_TEST_COIN_IDS = Lists.newArrayList(

    );

    public static final List<CoinType> SUPPORTED_COINS = ImmutableList.of(
            // BitcoinMain.get(),
            // AndescoinMain.get(),
            ArepacoinMain.get(),
            BolivarcoinMain.get(),
            LkrcoinMain.get(),
            OnixcoinMain.get(),
            RilcoinMain.get()

    );
}
