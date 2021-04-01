package pt.ulusofona.deisi.a2020.cm.g2


import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.graphics.toColor
import butterknife.OnClick
import butterknife.Optional
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_adicionar_teste.*

var testes: MutableList<Teste> = mutableListOf(Teste("01/04/2020", "Positivo", true, "Sintra"))
class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)
        bottomNavigation()
    }

    override fun onStart() {
        super.onStart()
        bottom_navigation.selectedItemId = R.id.ic_lista
        NavigationManager.goToListaFragment(supportFragmentManager)
        onClickFab()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.ic_perigo -> {
                bottom_navigation.isSelected = false
                NavigationManager.goToListaFragment(supportFragmentManager)}
            R.id.ic_lista -> NavigationManager.goToListaFragment(supportFragmentManager)
            R.id.ic_contactos -> NavigationManager.goToContactosFragment(supportFragmentManager)
        }
        return true
    }

    fun onClickFab(){
        ic_perigo_fab.setOnClickListener{
            bottom_navigation.selectedItemId = R.id.ic_perigo
            NavigationManager.goToEstouPerigoFragment(supportFragmentManager)
        }
    }

    private fun bottomNavigation(){
        bottom_navigation.setOnNavigationItemSelectedListener{ item ->
            when(item.itemId){
                R.id.ic_lista -> {
                    toolbar_main.title = "MyCovid-19"
                    toolbar_main.navigationIcon = null
                    NavigationManager.goToListaFragment(supportFragmentManager)
                    true}
                R.id.ic_contactos -> {
                    toolbar_main.title = "MyCovid-19"
                    toolbar_main.navigationIcon = null
                    NavigationManager.goToContactosFragment(supportFragmentManager)
                    true}
                else -> true
            }
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}