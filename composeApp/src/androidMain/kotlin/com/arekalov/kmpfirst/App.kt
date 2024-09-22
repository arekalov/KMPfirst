import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arekalov.kmpfirst.MainViewModel

@Composable
fun App(mainViewModel: MainViewModel = MainViewModel()) {
    MaterialTheme {
        val greetings by mainViewModel.greetingList.collectAsState()

        Column(
            modifier = Modifier.padding(all = 20.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            greetings.forEach { greeting ->
                Text(greeting)
                Divider()
            }
        }
    }
}