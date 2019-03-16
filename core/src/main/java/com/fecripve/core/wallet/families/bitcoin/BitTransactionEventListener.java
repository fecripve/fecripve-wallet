package com.fecripve.core.wallet.families.bitcoin;

import com.fecripve.core.network.AddressStatus;
import com.fecripve.core.network.ServerClient.UnspentTx;
import com.fecripve.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
