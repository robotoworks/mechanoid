import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.mechanoid.db.R.id;

public class Awesome extends FragmentActivity {
  private int x = 0;
  
  private String y;
  
  private TextView mTextBox;
  
  private int mechanoid_mTextBox_id = id.menu_settings;
  
  @Override
  public void onCreate(final Bundle icicle) {
    super.onCreate(icicle);
    
    this.x = icicle.getInt("Awesome.x");
    this.y = icicle.getString("Awesome.y");
    
  }
  
  @Override
  public void onSaveInstanceState(final Bundle outState) {
    super.onSaveInstanceState(outState);
    
    outState.putInt("Awesome.x", this.x);
    outState.putString("Awesome.y", this.y);
    
  }
  
  @Override
  public void setContentView(final int layoutResID) {
    super.setContentView(layoutResID);
    
    this.mTextBox = (TextView) findViewById(this.mechanoid_mTextBox_id);
    
  }
}
