package com.codegym.service.transfer;


import com.codegym.model.Transfer;
import com.codegym.service.IGeneralService;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface TransferService extends IGeneralService<Transfer> {

    String doTransfer(Transfer transfer);

    BigDecimal getSumFeesAmount();
}
