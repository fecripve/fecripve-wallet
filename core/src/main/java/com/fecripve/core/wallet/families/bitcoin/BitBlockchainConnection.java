package com.fecripve.core.wallet.families.bitcoin;

import com.fecripve.core.network.AddressStatus;
import com.fecripve.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
