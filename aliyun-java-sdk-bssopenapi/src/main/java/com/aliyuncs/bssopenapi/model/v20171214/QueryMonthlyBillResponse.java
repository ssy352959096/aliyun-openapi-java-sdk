/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryMonthlyBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMonthlyBillResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float outstandingAmount;

		private Float totalOutstandingAmount;

		private Float newInvoiceAmount;

		private String billingCycle;

		private List<Item> items;

		public Float getOutstandingAmount() {
			return this.outstandingAmount;
		}

		public void setOutstandingAmount(Float outstandingAmount) {
			this.outstandingAmount = outstandingAmount;
		}

		public Float getTotalOutstandingAmount() {
			return this.totalOutstandingAmount;
		}

		public void setTotalOutstandingAmount(Float totalOutstandingAmount) {
			this.totalOutstandingAmount = totalOutstandingAmount;
		}

		public Float getNewInvoiceAmount() {
			return this.newInvoiceAmount;
		}

		public void setNewInvoiceAmount(Float newInvoiceAmount) {
			this.newInvoiceAmount = newInvoiceAmount;
		}

		public String getBillingCycle() {
			return this.billingCycle;
		}

		public void setBillingCycle(String billingCycle) {
			this.billingCycle = billingCycle;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String item;

			private String productCode;

			private String productType;

			private String subscriptionType;

			private String solutionCode;

			private String solutionName;

			private Float pretaxGrossAmount;

			private Float invoiceDiscount;

			private Float deductedByCoupons;

			private Float pretaxAmount;

			private String currency;

			private Float pretaxAmountLocal;

			private Float tax;

			private Float afterTaxAmount;

			private Float outstandingAmount;

			private Float deductedByCashCoupons;

			private Float deductedByPrepaidCard;

			private Float paymentAmount;

			private String paymentCurrency;

			public String getItem() {
				return this.item;
			}

			public void setItem(String item) {
				this.item = item;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getProductType() {
				return this.productType;
			}

			public void setProductType(String productType) {
				this.productType = productType;
			}

			public String getSubscriptionType() {
				return this.subscriptionType;
			}

			public void setSubscriptionType(String subscriptionType) {
				this.subscriptionType = subscriptionType;
			}

			public String getSolutionCode() {
				return this.solutionCode;
			}

			public void setSolutionCode(String solutionCode) {
				this.solutionCode = solutionCode;
			}

			public String getSolutionName() {
				return this.solutionName;
			}

			public void setSolutionName(String solutionName) {
				this.solutionName = solutionName;
			}

			public Float getPretaxGrossAmount() {
				return this.pretaxGrossAmount;
			}

			public void setPretaxGrossAmount(Float pretaxGrossAmount) {
				this.pretaxGrossAmount = pretaxGrossAmount;
			}

			public Float getInvoiceDiscount() {
				return this.invoiceDiscount;
			}

			public void setInvoiceDiscount(Float invoiceDiscount) {
				this.invoiceDiscount = invoiceDiscount;
			}

			public Float getDeductedByCoupons() {
				return this.deductedByCoupons;
			}

			public void setDeductedByCoupons(Float deductedByCoupons) {
				this.deductedByCoupons = deductedByCoupons;
			}

			public Float getPretaxAmount() {
				return this.pretaxAmount;
			}

			public void setPretaxAmount(Float pretaxAmount) {
				this.pretaxAmount = pretaxAmount;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Float getPretaxAmountLocal() {
				return this.pretaxAmountLocal;
			}

			public void setPretaxAmountLocal(Float pretaxAmountLocal) {
				this.pretaxAmountLocal = pretaxAmountLocal;
			}

			public Float getTax() {
				return this.tax;
			}

			public void setTax(Float tax) {
				this.tax = tax;
			}

			public Float getAfterTaxAmount() {
				return this.afterTaxAmount;
			}

			public void setAfterTaxAmount(Float afterTaxAmount) {
				this.afterTaxAmount = afterTaxAmount;
			}

			public Float getOutstandingAmount() {
				return this.outstandingAmount;
			}

			public void setOutstandingAmount(Float outstandingAmount) {
				this.outstandingAmount = outstandingAmount;
			}

			public Float getDeductedByCashCoupons() {
				return this.deductedByCashCoupons;
			}

			public void setDeductedByCashCoupons(Float deductedByCashCoupons) {
				this.deductedByCashCoupons = deductedByCashCoupons;
			}

			public Float getDeductedByPrepaidCard() {
				return this.deductedByPrepaidCard;
			}

			public void setDeductedByPrepaidCard(Float deductedByPrepaidCard) {
				this.deductedByPrepaidCard = deductedByPrepaidCard;
			}

			public Float getPaymentAmount() {
				return this.paymentAmount;
			}

			public void setPaymentAmount(Float paymentAmount) {
				this.paymentAmount = paymentAmount;
			}

			public String getPaymentCurrency() {
				return this.paymentCurrency;
			}

			public void setPaymentCurrency(String paymentCurrency) {
				this.paymentCurrency = paymentCurrency;
			}
		}
	}

	@Override
	public QueryMonthlyBillResponse getInstance(UnmarshallerContext context) {
		return	QueryMonthlyBillResponseUnmarshaller.unmarshall(this, context);
	}
}
