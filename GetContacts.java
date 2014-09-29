import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

public class GetContacts {

    private Context _Context;
    private String name;
    private String number;
    private HashMap<String, String> hashMap;

    public GetContacts(Context context) {
        this._Context = context;
    }

    public List<HashMap<String, String>> getContact() {
        // intializes varivbles

        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        // gets contact contracter
        Cursor c = _Context.getContentResolver().query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);

        // adds data to list
        if (c != null) {
            c.moveToFirst();
            do {
                hashMap = new HashMap<String, String>();
                name = c.getString(c
                        .getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                
                number = c.getString(c
                        .getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

                hashMap.put("name", name);
                hashMap.put("number", number);
                list.add(hashMap);
            } while (c.moveToNext());
        }

        return list;
    }
}
