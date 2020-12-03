package com.xiaoma.mall.dao;

import com.alibaba.fastjson.JSONObject;
import com.xiaoma.mall.entity.Wallet;

public interface WalletDao {
    Wallet getWalletByMemberId(int memberId);

    void subtractWrehouse(JSONObject item);

    void update(JSONObject updateParams);

    void addWallet(Wallet wallet);
}
