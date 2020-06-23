package com.draft.agile.chapter.nineteen.classification;

import com.draft.agile.chapter.nineteen.bean.PayCheck;

/**
 * 〈支付方式〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/6
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface PaymentClassification {
   double calculatePay(PayCheck payCheck);
}
