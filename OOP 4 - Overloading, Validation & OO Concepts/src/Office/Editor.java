package Office;
/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Editor extends SkilledEmployee {
	
	//default is false
	private boolean prefersPaperEditing;

	public void setPrefersPaperEditing(boolean pref) {
		prefersPaperEditing = pref;
	}

	public String getEditingPreference() {
		if (prefersPaperEditing) {
			return "Paper";
		} else {
			return "Electronic";
		}
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Editing preference: " + getEditingPreference());
	}
}
