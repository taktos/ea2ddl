/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taktos
 * 
 */
public class ClassificationModel extends Model {
	private static final long serialVersionUID = 1L;

	private List<String> classificationList;

	public List<String> getClassificationList() {
		if (classificationList == null) {
			synchronized (this) {
				if (classificationList == null) {
					classificationList = new ArrayList<String>();
				}
			}
		}
		return classificationList;
	}

	public void setClassificationList(List<String> classificationList) {
		this.classificationList = classificationList;
	}

	public void addClassification(String classification) {
		getClassificationList().add(classification);
	}
}
