package ir.fardev.composetsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.fardev.composetsample.ui.theme.ComposetSampleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposetSampleTheme {
                Box(modifier = Modifier.padding(0.dp).fillMaxSize()) {
                    MainLayout()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainLayout() {
    // not rendered because surface rendered only one and last child
    Box(modifier = Modifier.background(Color.Blue).border(10.dp,color = Color.White)) {
        Column {
            Row {
                Text(text = " H A S S A N ", modifier = Modifier.width(100.dp).height(40.dp))
            }
            Row {
                Text(text = " B E R E N J ", modifier = Modifier.background(Color.Red).width(100.dp).height(40.dp))
            }
        }
    }
//    Box(modifier = Modifier.border(10.dp, color = Color.Gray).padding(0.dp).border(10.dp, Color.Magenta).background(Color.Black))
}
