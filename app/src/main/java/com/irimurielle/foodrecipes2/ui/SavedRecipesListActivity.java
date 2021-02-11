package com.irimurielle.foodrecipes2.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.irimurielle.foodrecipes2.R;
import com.irimurielle.foodrecipes2.models.Meals;

import butterknife.ButterKnife;

public class SavedRecipesListActivity extends AppCompatActivity {

    private DatabaseReference mMealReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recipes);
        ButterKnife.bind(this);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String uid = user.getUid();

        mMealReference = FirebaseDatabase.getInstance().getReference("Meals").child(uid);
    }
}
