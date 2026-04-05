package com.arq.partnerrenamelineage.service;

import com.arq.partnerrenamelineage.repository.LedgerRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LedgerServiceTest {
    @Test
    void returnsSeedData() {
        LedgerService service = new LedgerService(new LedgerRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
